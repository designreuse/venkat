package com.niit.shoppingcartbackendmodel;

import java.util.List;

import com.niit.shoppingcartbackend.model.Category;


public interface CategoryDAO {

	public List<Category>list();
	public Category get(String id);
	
	public void saveOrUpdate(Category category);
	
	public void delete(String id);
	
	public boolean isValidUser(String name,String password);

	}
	

