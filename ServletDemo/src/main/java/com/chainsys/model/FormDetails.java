package com.chainsys.model;

public class FormDetails {
	String name;
	String phoneNumber;
	String emailId;
	public FormDetails()
	{
		
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
		return "FormDetails [name=" + name + ", phoneNumber=" + phoneNumber + ", emailId=" + emailId + "]";
	}
	
}
