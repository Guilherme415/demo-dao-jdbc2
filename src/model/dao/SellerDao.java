package model.dao;

import java.util.List;

import model.entites.Department;
import model.entites.Seller;

public interface SellerDao {
	void insert (Seller obj);
	void uptade (Seller obj);
	void deleteById (Integer Id);
	Seller findById (Integer Id);
	List<Seller> findAll();
	List<Seller> findByDepartment(Department department);
}
