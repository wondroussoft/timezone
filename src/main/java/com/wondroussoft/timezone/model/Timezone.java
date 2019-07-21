package com.wondroussoft.timezone.model;

public class Timezone {
	
	Long id;
	String nameEng;
	String time;
	
	
	public Timezone() {
		
		
	}


	public Timezone(Long id, String nameEng, String time) {
		super();
		this.id = id;
		this.nameEng = nameEng;
		this.time = time;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNameEng() {
		return nameEng;
	}


	public void setNameEng(String nameEng) {
		this.nameEng = nameEng;
	}


	public String getTime() {
		return time;
	}


	public void setTime(String time) {
		this.time = time;
	}
	
	

	
	}
