package application;


import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;

import model.entites.Department;


public class Program2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

		System.out.println("=== Test 1: Seller findById ====");
		Department department = departmentDao.findById(3);
		System.out.println(department);
		
		List <Department> list = departmentDao.findAll();
		System.out.println("\n === Test 2: Department findAll ===");
		for (Department d : list) {
			System.out.println(d);
		}

		System.out.println("\n === Test 3: department insert ===");
		Department dep = new Department(null, "Music");
		departmentDao.insert(dep);
		System.out.println("Inserted! New id = " + dep.getId());

		System.out.println("\n === Test 4: department update ===");
		Department dep2 = departmentDao.findById(1); 
		dep2.setName("Food");
		departmentDao.uptade(dep2);
		System.out.println("Update completed");

		System.out.println("\n === Test 5: seller Delet ===");
		System.out.println("Enter id for delete test");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Delete completed");

		sc.close();
	}

}
