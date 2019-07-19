package com.wondroussoft.timezone.model;

public class Language {
	Long id;
	String language;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public Language(Long id, String language) {
		super();
		this.id = id;
		this.language = language;
	}
	public Language() {
			}
	

}
