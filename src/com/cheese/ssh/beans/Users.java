package com.cheese.ssh.beans;
// Generated 2016-4-14 22:03:23 by Hibernate Tools 4.3.1.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Users generated by hbm2java
 */
@Entity
@Table(name = "users", catalog = "dhucheese")
public class Users implements java.io.Serializable {

	private Integer userId;
	private String username;
	private String password;
	private Integer gender;

	public Users() {
	}

	public Users(String username, String password, Integer gender) {
		this.username = username;
		this.password = password;
		this.gender = gender;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "userId", unique = true, nullable = false)
	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	@Column(name = "username")
	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Column(name = "password")
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "gender")
	public Integer getGender() {
		return this.gender;
	}

	public void setGender(Integer gender) {
		this.gender = gender;
	}

}