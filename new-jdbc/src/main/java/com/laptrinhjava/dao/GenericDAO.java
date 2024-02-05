package com.laptrinhjava.dao;

import java.util.List;

import com.laptrinhjava.mapper.RowMapper;

public interface GenericDAO<T> {
	<T> List <T> query(String sql, RowMapper<T> rowMapper, Object... parameters);	//Khôg biết khai báo bao nhiều số lượng điều kiện nên phải dùng Object... parameters: chuyền bao nhiêu tham số cũng đc
	void update(String sql, Object... parameters);
	Long insert(String sql, Object... parameters);
}
