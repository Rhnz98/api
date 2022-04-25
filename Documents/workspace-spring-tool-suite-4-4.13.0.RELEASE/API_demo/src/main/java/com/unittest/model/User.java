package com.unittest.model;

public class User {

	private String title;
	private String content;
	public User(String title, String content) {
		super();
		this.title = title;
		this.content = content;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	
}
