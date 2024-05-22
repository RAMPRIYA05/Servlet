package com.chainsys.model;

public class FormDetails {
	String name;
	String phoneNumber;
	String emailId;
	int id;
	public FormDetails() {
		
	}
	public FormDetails(String name, String emailId, String phoneNumber) {
		// TODO Auto-generated constructor stub
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	@Override
	public String toString() {
		return "FormDetails [name=" + name + ", phoneNumber=" + phoneNumber + ", emailId=" + emailId + ", id=" + id
				+ "]";
	}
	
}
