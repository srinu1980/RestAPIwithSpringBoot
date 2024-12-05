package com.cts.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="Product_Table")
public class Product
{

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Product_Id")
	private int id;
	
	private String productName;
	private int qty;
	
	@Column(name="Product_Price")
	private double price;
	
	
}
