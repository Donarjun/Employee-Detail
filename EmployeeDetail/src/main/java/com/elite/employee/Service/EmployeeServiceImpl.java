package com.elite.employee.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elite.employee.DAO.EmployeeDAO;
import com.elite.employee.model.Employee;

import org.springframework.transaction.annotation.Transactional;

@Service("employeeServiceImpl")
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeDAO employeeDAOImpl;

	@Override
	public List<Employee> getAllEmplyee() {

		List<Employee> empList = employeeDAOImpl.getAllEmplyee();

		return empList;
	}

	@Override
	public Employee getEmployeeById(int id) {
		// TODO Auto-generated method stub
		Employee e = employeeDAOImpl.getEmployeeById(id);
		return e;
	}

	@Override
	public void updateEmployee() {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteEmployee() {
		// TODO Auto-generated method stub

	}

	@Override
	public void addEmployee(Employee emp) {
		employeeDAOImpl.addEmployee(emp);
	}

}
