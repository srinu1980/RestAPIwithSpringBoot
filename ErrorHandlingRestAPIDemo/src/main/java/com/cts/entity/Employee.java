package com.cts.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Employee {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
	 	private long id;
	    private String firstName;
	    private String lastName;
	    
	    @Column(name="email_Address", nullable=false)
	    private String emailId;
	    
}
