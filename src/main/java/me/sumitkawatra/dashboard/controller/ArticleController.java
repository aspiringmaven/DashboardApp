package me.sumitkawatra.dashboard.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import me.sumitkawatra.dashboard.domain.Article;
import me.sumitkawatra.dashboard.service.ArticleService;


@Controller
public class ArticleController {
	
	@Autowired
	private ArticleService articleService;
	
	@RequestMapping(value="/article", method=RequestMethod.GET)
	public String article(Model model){
		System.out.println("This is Called.");
		Article article = new Article();
		model.addAttribute("newArticle", article);
		return "Article";
	}
	
	
	@RequestMapping(value="/article", method=RequestMethod.POST)
	public String saveArticle(@ModelAttribute("newArticle")Article article) {
		getArticleService().save(article);
		return "redirect:/articles";
	}
	
	@RequestMapping("/articles")
	public String articles(Model model) {
		List<Article> articles = articleService.getAll(); 
		model.addAttribute("articles", articles);
		return "Articles";
	}
	
	@RequestMapping(value = "/article/{articleId}", method=RequestMethod.GET)
	public String updateArticle(@PathVariable("articleId") int articleId, Model model) {
		Article article = articleService.get(articleId);
		model.addAttribute("newArticle",article);
		return "Article";
	}
	
	@RequestMapping(value = "/article/delete/{articleId}", method=RequestMethod.GET)
	public String deleteArticle(@PathVariable("articleId") int articleId, Model model) {
		
		articleService.delete(articleId);
		
		return "redirect:/articles";
	}
	
	
	public ArticleService getArticleService() {
		return articleService;
	}
	
	public void setArticleService(ArticleService articleService) {
		this.articleService = articleService;
	}
}
