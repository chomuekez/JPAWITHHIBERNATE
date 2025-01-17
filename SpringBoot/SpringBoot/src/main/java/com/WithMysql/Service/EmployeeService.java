package com.WithMysql.Service;

import java.util.List;


import com.WithMysql.Model.Employee;

public interface EmployeeService {
	List<Employee> get();
	Employee get(int id);
	void save(Employee employee);
	void delete(int id);

}
