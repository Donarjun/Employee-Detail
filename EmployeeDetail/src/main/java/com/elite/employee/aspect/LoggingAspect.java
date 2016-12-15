package com.elite.employee.aspect;

import java.util.List;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.web.servlet.ModelAndView;

import com.elite.employee.model.Employee;

@Aspect
public class LoggingAspect {
	
	@Before("execution(public List<Employee> getAllEmplyee())")
	public void loggingAdvice(){
		System.out.println("Advice run, method called for retriving all employee details");
	}

}
