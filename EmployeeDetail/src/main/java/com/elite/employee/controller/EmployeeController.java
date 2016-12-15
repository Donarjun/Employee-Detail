package com.elite.employee.controller;

import java.beans.Transient;
import java.util.Date;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Produces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.http.MediaType;

import com.elite.employee.Service.EmployeeService;
import com.elite.employee.model.Employee;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeServiceImpl;
    @GET
	@RequestMapping(value = "/allEmployees")
	public ModelAndView myMethod() {
		List<Employee> empList = employeeServiceImpl.getAllEmplyee();
		ModelAndView m = new ModelAndView("allEmpList");
		m.addObject("empList", empList);
		return m;
	}

	@RequestMapping(value = "/addEmployee")
	public void addEmp() {
		Employee emp = new Employee(10,"Yuvaraj", "Singh", new Date(
				2016 - 06 - 13), new Date(2016 - 06 - 21));
		employeeServiceImpl.addEmployee(emp);

	}
	@GET
	@RequestMapping(value = "/getEmployee/{id}")
	public ModelAndView getEmp(@PathVariable("id") int id) {
		Employee e = employeeServiceImpl.getEmployeeById(id);
		// return e;
		ModelAndView modelandView = new ModelAndView("singleEmp");
		modelandView.addObject("e", e);
		return modelandView;

	}
}
