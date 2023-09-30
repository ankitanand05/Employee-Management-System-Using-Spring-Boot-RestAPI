package com.curdapplication.dao;

import com.curdapplication.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> findAllEmployees();

    Employee findEmployeeById(int id);

    Employee saveEmployee(Employee theEmployee);

    void deleteEmployeeById(int theId);
}
