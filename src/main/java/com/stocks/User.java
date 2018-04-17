package com.stocks;

import java.sql.Date;
import java.sql.Timestamp;

public class User {
	
	private String username;
	private String password;
	private Date account_creation_date;
	private Timestamp loginTime;

	
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
	public Date getAccount_creation_date() {
		return account_creation_date;
	}
	public void setAccount_creation_date(Date account_creation_date) {
		this.account_creation_date = account_creation_date;
	}
	public Timestamp getLoginTime() {
		return loginTime;
	}
	public void setLoginTime(Timestamp loginTime) {
		this.loginTime = loginTime;
	}
	
	
	
	
}
