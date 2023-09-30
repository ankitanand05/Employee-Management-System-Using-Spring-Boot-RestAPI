package com.curdapplication.dao;

import com.curdapplication.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO{

    private final EntityManager entityManager;

    @Autowired
    public EmployeeDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Employee> findAllEmployees() {
        //create a query
        TypedQuery<Employee> theQuery = entityManager.createQuery("FROM Employee",Employee.class);

        //execute query and get result list
        List<Employee> employees = theQuery.getResultList();

        //return the result
        return employees;
    }

    @Override
    public Employee findEmployeeById(int id) {
        //Get employee
        Employee theEmployee = entityManager.find(Employee.class,id);

        //return the employee
        return theEmployee;
    }

    @Override
    public Employee saveEmployee(Employee employee) {
        return  entityManager.merge(employee);

    }

    @Override
    public void deleteEmployeeById(int theId) {
        //find employee by id
        Employee employee = entityManager.find(Employee.class,theId);

        //remove employee
        entityManager.remove(employee);
    }


}
