package com.cts.service;

import java.util.Collection;
import java.util.*;

import org.springframework.stereotype.Service;

import com.cts.exception.ProductNotFoundException;
import com.cts.model.Product;

@Service
public class ProductServiceImpl implements ProductService 
{
	 private static Map<String, Product> productRepository = new HashMap<>();

	 static {
		   Product mobile = new Product();
		      mobile.setId("1");
		      mobile.setName("Samsung Galaxy SE21");
		      mobile.setPrice(45000.45);
		      productRepository.put(mobile.getId(), mobile);

		      Product laptop = new Product();
		      laptop.setId("2");
		      laptop.setName("HP Pavilion Gaming Laptop");
		      laptop.setPrice(64509.50);
		      productRepository.put(laptop.getId(), laptop);

	   }
	   @Override
	   public void createProduct(Product product) {
		   productRepository.put(product.getId(), product);
	   }
	   @Override
	   public void updateProduct(String id, Product product) {
		   
		   if(!productRepository.containsKey(id))throw new ProductNotFoundException();
		   productRepository.remove(id);
	      product.setId(id);
	      productRepository.put(id, product);
	   }
	   @Override
	   public void deleteProduct(String id) {
		   productRepository.remove(id);

	   }
	   @Override
	   public Collection<Product> getProducts() {
	      return productRepository.values();
	   }
	@Override
	public Product getProductById(String id) {
		// TODO Auto-generated method stub
		return productRepository.get(id);
	}
}
