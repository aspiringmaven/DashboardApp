package me.sumitkawatra.dashboard.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import me.sumitkawatra.dashboard.domain.Article;

@Repository
public class ArticleDaoImpl extends HibernateDaoSupport implements ArticleDao {
	
	public ArticleDaoImpl() {	
	}

	@Autowired	
	public ArticleDaoImpl(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	public List<Article> getAll() {
		Session session = getSessionFactory().openSession();
		Query query = session.createQuery("from Article");
		session.beginTransaction();
		@SuppressWarnings("unchecked")
		List<Article> articles =  (List<Article>) query.list();
		session.getTransaction().commit();
		session.close();
		return articles;
	}

	public Article get(int articleId) {
		Session session = getSessionFactory().openSession();
		Article article = null;
		session.beginTransaction();
		article = (Article) session.get(Article.class, articleId);
		session.getTransaction().commit();
		session.close();
		return article;
	}

	public void update(Article article) {
		Session session = getSessionFactory().openSession();		
		session.beginTransaction(); 
		session.update(article);
		session.getTransaction().commit();
		session.close();		
	}

	public int delete(int articleId) {
		Session session = getSessionFactory().openSession();
		Query query = session.createQuery("delete Article where id = :articleId");
		query.setInteger("articleId", articleId);
		session.beginTransaction(); 
		int val = query.executeUpdate();
		if(val <= 1){
			System.out.println("Deleted count "+val);
			session.getTransaction().commit();
		} else {		
			session.getTransaction().rollback();
		}
		return val; 
		
	}

	
	public void save(Article article) {
		Session session = getSessionFactory().openSession();
		session.beginTransaction(); 
		session.saveOrUpdate(article);
		session.getTransaction().commit();
		session.close();
		
	}

}
