package com.wondroussoft.timezone.model;

public class Timezone {

	Long id;
	String zoneName;
	String abbreviation;
	Double gmtOffset;
	Boolean daylightSavingTime;
	String currentTime;

	public Timezone() {

	}

	public Timezone(Long id, String zoneName, String abbreviation, Double gmtOffset, Boolean daylightSavingTime,
			String currentTime) {
		this.id = id;
		this.zoneName = zoneName;
		this.abbreviation = abbreviation;
		this.gmtOffset = gmtOffset;
		this.daylightSavingTime = daylightSavingTime;
		this.currentTime = currentTime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getZoneName() {
		return zoneName;
	}

	public void setZoneName(String zoneName) {
		this.zoneName = zoneName;
	}

	public String getAbbreviation() {
		return abbreviation;
	}

	public void setAbbreviation(String abbreviation) {
		this.abbreviation = abbreviation;
	}

	public Double getGmtOffset() {
		return gmtOffset;
	}

	public void setGmtOffset(Double gmtOffset) {
		this.gmtOffset = gmtOffset;
	}

	public Boolean getDaylightSavingTime() {
		return daylightSavingTime;
	}

	public void setDaylightSavingTime(Boolean daylightSavingTime) {
		this.daylightSavingTime = daylightSavingTime;
	}

	public String getCurrentTime() {
		return currentTime;
	}

	public void setCurrentTime(String currentTime) {
		this.currentTime = currentTime;
	}

}
