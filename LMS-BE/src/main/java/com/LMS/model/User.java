//package com.LMS.model;
//
//import java.sql.Timestamp;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//
//import lombok.Data;
//
//
//
//@Entity
//@Data
//public class User {
//	
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private Long userId;
//	
//	private String name;
//	
//	private String email;
//	
//	private Long mobile;
//
//	private String password;
//	
//	private String role;
//	
//	@Column(columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP" , insertable = false ,updatable = false)
//	private Timestamp createdOn;
//	
//	@Column(nullable = false)
//	private Integer invalidAccessAttempt;
//
//	
//
//}
