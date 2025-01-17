package com.erkinkubatov.springMVC_Hibernate_AOP.dao;

import com.erkinkubatov.springMVC_Hibernate_AOP.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    public List<Employee> getAllEmployees();

   public void saveEmployee(Employee employee);

   public Employee getEmployeeById(int id);

   public void deleteEmployee(int id);
}
