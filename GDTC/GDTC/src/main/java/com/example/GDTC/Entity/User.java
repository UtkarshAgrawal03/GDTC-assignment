package com.example.GDTC.Entity;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;
	@NotBlank(message="UserName Cannot be blank..")
	private String userName;
	
	private long phoneNo;
	@NotBlank(message="Email Cannot be blank..")
	@Email(message="Invalid email address")
	private String email;
	@OneToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	private UserPersonal userPersonal;
	@CreationTimestamp
	private LocalDate createdOn;
	@UpdateTimestamp
	private LocalDate ChangedOn;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int userId, String userName, long phoneNo,
			 String email,
			UserPersonal userPersonal, LocalDate createdOn, LocalDate changedOn) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.phoneNo = phoneNo;
		this.email = email;
		this.userPersonal = userPersonal;
		this.createdOn = createdOn;
		ChangedOn = changedOn;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public UserPersonal getUserPersonal() {
		return userPersonal;
	}
	public void setUserPersonal(UserPersonal userPersonal) {
		this.userPersonal = userPersonal;
	}
	public LocalDate getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(LocalDate createdOn) {
		this.createdOn = createdOn;
	}
	public LocalDate getChangedOn() {
		return ChangedOn;
	}
	public void setChangedOn(LocalDate changedOn) {
		ChangedOn = changedOn;
	}
	@Override
	public String toString() {
		return "User [ userName=" + userName + ", phoneNo=" + phoneNo + ", email=" + email
				+ ", userPersonal=" + userPersonal + "]";
	}
	

}
