package com.ss.mybatis.entity;

import java.util.Date;

public class Document {
	public Long id;
	public String name;
	public String path;
	public Integer enabled;
	public String keywords;
	public String description;
	public Date createdTime;
	public User user;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public Integer getEnabled() {
		return enabled;
	}
	public void setEnabled(Integer enabled) {
		this.enabled = enabled;
	}
	public String getKeywords() {
		return keywords;
	}
	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getCreatedTime() {
		return createdTime;
	}
	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	@Override
	public String toString() {
		return "Document [id=" + id + ", name=" + name + ", path=" + path + ", enabled=" + enabled + ", keywords="
				+ keywords + ", description=" + description + ", createdTime=" + createdTime + ", user=" + user + "]";
	}
	
}
