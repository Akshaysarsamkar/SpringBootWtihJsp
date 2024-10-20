/* 

 Create a Spring Boot application for managing user profiles. Each user should have attributes like 
 id, username, email, and registrationDate. Implement CRUD operations to 
 create, read, update, and delete user profiles.
 
 */

package com.example.demo.Entities;

import java.sql.Date;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "UserInfo")
public class User1 {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "UserId")
	private int id;
	private String userName;
	private String email;
	private LocalDate registrationDate;

	public User1() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User1(int id, String userName, String email, LocalDate registrationDate) {
		super();
		this.id = id;
		this.userName = userName;
		this.email = email;
		this.registrationDate = registrationDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public LocalDate getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(LocalDate localDate) {
		this.registrationDate = localDate;
	}

	@Override
	public String toString() {
		return "User1 [id=" + id + ", userName=" + userName + ", email=" + email + ", registrationDate="
				+ registrationDate + "]";
	}

}
