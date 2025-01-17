/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.JPA.Hibernate.JPA.with.Hibernate.Resource;

import com.JPA.Hibernate.JPA.with.Hibernate.Persistence.Employee;
import com.JPA.Hibernate.JPA.with.Hibernate.Service.EmployeeService;
import java.util.List;
import java.util.Optional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeResource {
    EmployeeService empService;

    public EmployeeResource(EmployeeService empService) {
        this.empService = empService;
    }
    @GetMapping(value="/employees")
    public List<Employee> getAllEmployees()
    {
        return this.empService.getAllEmployees();
    }
    
     @GetMapping(value="/employees{empId}")
    public Employee getById(@PathVariable Long empId)
    {
        return this.empService.getById(empId);
    }
     @GetMapping(value="/employees")
    private Employee AddEmployee(Employee employee)
    {
        return this.empService.AddEmployee(employee);
    }
     @GetMapping(value="/employees{empId}", consumes="application/json")
    public Employee UpdateEmployee(@PathVariable Long empId, @RequestBody Employee employee)
    {
        return this.empService.UpdateEmployee(empId, employee);
    }
     @DeleteMapping(value="/employees{Id}")
    public void deleteEmployee(@PathVariable Long empId)
    {
        this.empService.deleteEmployee(empId);
    }
    
    
}
