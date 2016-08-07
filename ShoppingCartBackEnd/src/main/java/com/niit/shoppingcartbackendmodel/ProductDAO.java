package com.niit.shoppingcartbackendmodel;

import java.util.List;

import com.niit.shoppingcartbackend.model.Product;


public interface ProductDAO {

	public List<Product> list();
	public Product get(int id);
	
	public void saveOrUpdate(Product product);
	
	public void delete(int id);

	}
	

