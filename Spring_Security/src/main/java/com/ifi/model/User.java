package com.ifi.model;

import java.util.List;

import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.mapping.Table;

@Table("user")
public class User {
	@PrimaryKeyColumn(name = "username", ordinal = 0, type = PrimaryKeyType.PARTITIONED)
	private String username;

	@Column
	private String password;
	@Column
	private Boolean active;
	@Column
	private List<String> role;
	
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


	
	public User(String username, String password, Boolean active, List<String> role) {
		super();
		this.username = username;
		this.password = password;
		this.active = active;
		this.role = role;
	}
	public Boolean getActive() {
		return active;
	}
	public void setActive(Boolean active) {
		this.active = active;
	}
	public List<String> getRole() {
		return role;
	}
	public void setRole(List<String> role) {
		this.role = role;
	}
	public User() {
		super();
	}
	public User(User user) {
		this.username=user.username;
		this.password=user.password;
		this.role=user.role;
		this.active=user.active;
		// TODO Auto-generated constructor stub
	}
	
	
}
