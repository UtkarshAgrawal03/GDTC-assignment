package com.example.GDTC.Entity;

import java.time.LocalDate;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.NotBlank;

@Entity
public class UserPersonal {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int personalId;
	@NotBlank(message="firstName cannot be blank")
	private String firstName;
	private String middleName;
	private String lastName;
	private String fullName;
	@Temporal(TemporalType.DATE)
	private Date DOB;
	private String aadharId;
	private char gender;

	public UserPersonal() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserPersonal(int personalId, String firstName,
			String middleName, String lastName, String fullName, Date dOB, String aadharId, char gender
			) {
		super();
		this.personalId = personalId;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.fullName = fullName;
		DOB = dOB;
		this.aadharId = aadharId;
		this.gender = gender;
		
	}
	
	public int getPersonalId() {
		return personalId;
	}
	public void setPersonalId(int personalId) {
		this.personalId = personalId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public Date getDOB() {
		return DOB;
	}
	public void setDOB(Date dOB) {
		DOB = dOB;
	}
	public String getAadharId() {
		return aadharId;
	}
	public void setAadharId(String aadharId) {
		this.aadharId = aadharId;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "UserPersonal [personalId=" + personalId + ", firstName=" + firstName + ", middleName=" + middleName
				+ ", lastName=" + lastName + ", fullName=" + fullName + ", DOB=" + DOB + ", aadharId=" + aadharId
				+ ", gender=" + gender + "]";
	}
	

}
