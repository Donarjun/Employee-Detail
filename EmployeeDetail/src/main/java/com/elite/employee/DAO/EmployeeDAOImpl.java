package com.elite.employee.DAO;

import java.beans.Transient;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.elite.employee.model.Employee;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

	@Autowired
	SessionFactory sessionFactory;

	@Override
	public List<Employee> getAllEmplyee() {
		Session session = sessionFactory.openSession();
		String q = "from com.elite.employee.model.Employee";
		Query query = session.createQuery(q);
		@SuppressWarnings("unchecked")
		List<Employee> empList = query.list();
		return empList;
	}

	@Override
	public Employee getEmployeeById(int id) {
		Session session = sessionFactory.openSession();
		Employee e = (Employee) session.get(Employee.class, id);
		return e;
	}

	@Override
	public void updateEmployee() {
		Session session = sessionFactory.openSession();
		session.getTransaction().begin();

	}

	@Override
	public void deleteEmployee() {
		// TODO Auto-generated method stub

	}

	@Override
	public void addEmployee(Employee emp) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(emp);
		session.getTransaction().commit();

	}

}
