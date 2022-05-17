package com.jobiak.mvc.model;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="bankdetails")
public class BankUser {
	@Id//primary key
	private Long custId;
	private String name;
	private String city;
	private Long pincode;
	private String email;
	private Long phone;
	
	
	public BankUser() {
		
		// TODO Auto-generated constructor stub
	}


	public Long getCustId() {
		return custId;
	}


	public void setCustId(Long custId) {
		this.custId = custId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public Long getPincode() {
		return pincode;
	}


	public void setPincode(Long pincode) {
		this.pincode = pincode;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Long getPhone() {
		return phone;
	}


	public void setPhone(Long phone) {
		this.phone = phone;
	}
	

}