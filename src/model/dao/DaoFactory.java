package model.dao;

import db.DB;
import model.dao.impl.DepartmentDaoJDBC;
import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {
	
	public static SellerDao createSellerDao() {
		return (SellerDao) new SellerDaoJDBC(DB.getConnection());
		}
	public static DepartmentDao createDepartmentDao() {
		return (DepartmentDao) new DepartmentDaoJDBC(DB.getConnection());
	}
}
