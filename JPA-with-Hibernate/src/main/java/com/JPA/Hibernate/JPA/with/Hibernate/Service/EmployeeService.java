
package com.JPA.Hibernate.JPA.with.Hibernate.Service;

import com.JPA.Hibernate.JPA.with.Hibernate.Persistence.Employee;
import com.JPA.Hibernate.JPA.with.Hibernate.Persistence.EmployeeRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;


@Service
public class EmployeeService {
    EmployeeRepository repository;

    public EmployeeService(EmployeeRepository repository) {
        this.repository = repository;
    }
    public List<Employee> getAllEmployees()
    {
    return this.repository.findAll();
    }
    public Employee getById(Long empId)
    {
     return this.repository.findById(empId).get();
    }
    public Employee AddEmployee(Employee employee)
    {
    return this.repository.save(employee);
    }
    public Employee UpdateEmployee(Long empId, Employee employee)
    {
        Optional<Employee> emp = this.repository.findById(empId);
        if(emp.isPresent()){
            emp.get().setName(employee.getName());
            return this.repository.save(emp.get());
        
        }
        throw new RuntimeException();
    }
    public void deleteEmployee(Long empId)
    {
    this.repository.deleteById(empId);
    }
    
    
}
