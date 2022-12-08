package Responses;

import java.time.LocalDate;

public class UserDetails {
	private String userName;
	private String email;
	private long phoneNo;
	private String fname;
	private String mname;
	private String lname;
	private char gender;
	private String AadharId;
	private LocalDate DOB;
	public UserDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserDetails(String userName, String email, long phoneNo, String fname, String mname, String lname,
			char gender, String aadharId, LocalDate dOB) {
		super();
		this.userName = userName;
		this.email = email;
		this.phoneNo = phoneNo;
		this.fname = fname;
		this.mname = mname;
		this.lname = lname;
		this.gender = gender;
		AadharId = aadharId;
		DOB = dOB;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public String getAadharId() {
		return AadharId;
	}
	public void setAadharId(String aadharId) {
		AadharId = aadharId;
	}
	public LocalDate getDOB() {
		return DOB;
	}
	public void setDOB(LocalDate dOB) {
		DOB = dOB;
	}
	

}
