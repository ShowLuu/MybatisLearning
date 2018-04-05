package com.ss.mybatis.entity;

import java.util.Date;
import java.util.List;

public class User {
	public Long id;
	public String username;
	public String password;
	public Integer enabled;
	public String avatar;
	public Date createdTime;
	public Date lastModifiedTime;
	public Date lastLoginedTime;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getEnabled() {
		return enabled;
	}

	public void setEnabled(Integer enabled) {
		this.enabled = enabled;
	}

	public Date getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public Date getLastModifiedTime() {
		return lastModifiedTime;
	}

	public void setLastModifiedTime(Date lastModifiedTime) {
		this.lastModifiedTime = lastModifiedTime;
	}

	public Date getLastLoginedTime() {
		return lastLoginedTime;
	}

	public void setLastLoginedTime(Date lastLoginedTime) {
		this.lastLoginedTime = lastLoginedTime;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", enabled=" + enabled
				+ ", avatar=" + avatar + ", createdTime=" + createdTime + ", lastModifiedTime=" + lastModifiedTime
				+ ", lastLoginedTime=" + lastLoginedTime + "]";
	}
	
}
