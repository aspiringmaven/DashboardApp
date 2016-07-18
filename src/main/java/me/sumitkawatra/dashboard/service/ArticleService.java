package me.sumitkawatra.dashboard.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.sumitkawatra.dashboard.dao.ArticleDao;
import me.sumitkawatra.dashboard.domain.Article;

@Service
public class ArticleService {

	@Autowired
	private ArticleDao articleDao;

	public List<Article> getAll() {
		return articleDao.getAll();
	}

	public Article get(int articleId) {
		return articleDao.get(articleId);
	}

	public Article update(Article article) {
		return null;
	}

	public Article delete(int articleId) {
		Article article = articleDao.get(articleId);
		if (article != null) {
			articleDao.delete(articleId);
		} else {
			System.out.println("Delete Fucked!");
		}
		return article;
	}

	public void save(Article article) {
		articleDao.save(article);
	}

	public ArticleDao getArticleDao() {

		return articleDao;
	}

	public void setArticleDao(ArticleDao articleDao) {
		this.articleDao = articleDao;
	}
}
