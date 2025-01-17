package com.WithMysql.Service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.WithMysql.DAO.EmployeeDAO;
import com.WithMysql.Model.Employee;
	@Service
public class EmployeeServiceImplementation implements EmployeeService {
		@Autowired
		private EmployeeDAO empDAO;
	@Transactional
	@Override
	public List<Employee> get() {
 		return  empDAO.get();
	}
	@Transactional
	@Override
	public Employee get(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Transactional
	@Override
	public void save(Employee employee) {
		// TODO Auto-generated method stub
		
	}
	@Transactional
	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

}
