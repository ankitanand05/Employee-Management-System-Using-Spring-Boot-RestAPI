package com.curdapplication.service;

import com.curdapplication.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAllEmployee();


    Employee findEmployeeById(int id);

    Employee saveEmployee(Employee theEmployee);

    void deleteEmployeeById(int theId);
}
