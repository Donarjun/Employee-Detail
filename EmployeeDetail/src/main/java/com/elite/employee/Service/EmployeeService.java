package com.elite.employee.Service;

import java.util.List;

import com.elite.employee.model.Employee;

public interface EmployeeService {
	

	List<Employee> getAllEmplyee();
	
	Employee getEmployeeById(int id);
	
	void addEmployee(Employee emp);
	
	void updateEmployee();
	
	void deleteEmployee();

}
