package com.LMS.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Data
public class Request {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	
	private Long userId;
	
	private int top;
	
	private int bottom ;
	
	private int woolen;
	
	private String address;
	
	private String contactPerson;
	
	private String description;
	
	@JsonFormat(pattern = "dd/MM/yyyy")
	private LocalDate date;
	
	private String status;
	
	
	
	
	
	
	
}
