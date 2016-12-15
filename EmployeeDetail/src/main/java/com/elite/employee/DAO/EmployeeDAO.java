package com.elite.employee.DAO;

import java.util.List;

import com.elite.employee.model.Employee;

public interface EmployeeDAO {
	
	List<Employee> getAllEmplyee();
	
	Employee getEmployeeById(int id);
	
	void addEmployee(Employee emp);
	
	void updateEmployee();
	
	void deleteEmployee();

}
