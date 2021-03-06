package com.cdl.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;


@Entity
@Table(name="users")
public class Users {
	
	@Id
	@Column(name="id")
	private int id;
	
	@NotEmpty
	@Column(name="username")
	private String username;
	
	@NotEmpty
	@Column(name="password")
	private String password;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
	
	
}
