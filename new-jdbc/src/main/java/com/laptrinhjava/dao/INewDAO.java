package com.laptrinhjava.dao;

import java.util.List;

import com.laptrinhjava.model.NewModel;

public interface INewDAO extends GenericDAO<NewModel>{
	NewModel findOne(Long id);
	List<NewModel> findByCategoryId(Long categoryId);
	Long save(NewModel newModel);
	void update(NewModel updateNew);
	void delete(long id);
}
