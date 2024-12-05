package com.cts.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String title;
	private BigDecimal price;
	private LocalDate publishDate;
	public Book(String title, BigDecimal price, LocalDate publishDate) {
		super();
		this.title = title;
		this.price = price;
		this.publishDate = publishDate;
	}
	
	
}
