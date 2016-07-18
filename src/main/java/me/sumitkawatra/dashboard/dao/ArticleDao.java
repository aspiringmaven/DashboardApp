package me.sumitkawatra.dashboard.dao;

import java.util.List;

import me.sumitkawatra.dashboard.domain.Article;

public interface ArticleDao {
	
	public abstract List<Article> getAll();
	public abstract Article get(int articleId);
	public abstract void update(Article article);
	public abstract int delete(int articleId);
	public abstract void save(Article article);

}