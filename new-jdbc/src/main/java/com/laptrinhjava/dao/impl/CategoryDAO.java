package com.laptrinhjava.dao.impl;

import java.util.List;

import com.laptrinhjava.dao.ICategoryDAO;
import com.laptrinhjava.mapper.CategoryMapper;
import com.laptrinhjava.model.CategoryModel;

public class CategoryDAO extends AbstractDAO<CategoryModel> implements ICategoryDAO {

	@Override
	public List<CategoryModel> findAll() {
		String sql = "SELECT * FROM category";
		return query(sql, new CategoryMapper());
	}
	
}
