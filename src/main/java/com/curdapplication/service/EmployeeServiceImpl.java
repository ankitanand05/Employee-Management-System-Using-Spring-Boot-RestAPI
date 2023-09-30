package com.curdapplication.service;

import com.curdapplication.dao.EmployeeDAO;
import com.curdapplication.entity.Employee;
import jakarta.persistence.Table;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    private final EmployeeDAO employeeDAO;

    @Autowired
    public EmployeeServiceImpl(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }

    @Override
    public List<Employee> findAllEmployee() {
        return employeeDAO.findAllEmployees();
    }

    @Override
    public Employee findEmployeeById(int id) {
        return employeeDAO.findEmployeeById(id);
    }

    @Override
    @Transactional
    public Employee saveEmployee(Employee theEmployee) {
        return employeeDAO.saveEmployee(theEmployee);
    }

    @Override
    @Transactional
    public void deleteEmployeeById(int theId) {
        employeeDAO.deleteEmployeeById(theId);
    }
}
