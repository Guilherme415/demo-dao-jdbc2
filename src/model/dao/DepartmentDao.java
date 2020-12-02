package model.dao;

import java.util.List;

import model.entites.Department;

public interface DepartmentDao {
	
	void insert (Department obj);
	void uptade (Department obj);
	void deleteById (Integer Id);
	Department findById (Integer Id);
	List<Department> findAll();
}
