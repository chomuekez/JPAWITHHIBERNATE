
package com.WithMysql.DAO;
import java.util.List;

import com.WithMysql.Model.Employee;

public interface EmployeeDAO {
	List<Employee> get();
	Employee get(int id);
	void save(Employee employee);
	void delete(int id);
	

}
