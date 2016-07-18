package me.sumitkawatra.dashboard.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Article {
	@Id 
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "article_seq_gen")
	@SequenceGenerator(name = "article_seq_gen", sequenceName = "article_seq")
	private int id;
	
	private String title;
	private String text;
	private String author;
	
	public Article() {
		this.setAuthor("");
		this.setText("");
		this.setTitle("");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}	
}