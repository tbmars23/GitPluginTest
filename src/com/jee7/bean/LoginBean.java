package com.jee7.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name="loginBean")
@RequestScoped
public class LoginBean {
	
	private int id;
	private String userName;
	private String password;
	private String email;
	private String errorMsg;
	
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getErrorMsg() {
		return errorMsg;
	}
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	// id
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	// add email
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String validate()
	{
		if ("admin".equals(userName) && "admin".equals(password)) {
			errorMsg = null;
			return "welcome";
		} else {
			errorMsg = "Invalid user id or password. Please try again";
			return null;
		}
	}
	// bug#1234
	public boolean isOK() {
		return true;
	}

}
