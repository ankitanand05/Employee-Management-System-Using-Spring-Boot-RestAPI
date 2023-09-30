package com.curdapplication.restcontroller;

import com.curdapplication.entity.Employee;
import com.curdapplication.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

    //Inject the employee service using constructor injection
    private final EmployeeService employeeService;

    @Autowired
    public EmployeeRestController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }


    //expose  "/employee" and return a list of employee
    @GetMapping("/employees")
    public List<Employee> findAll(){
        return employeeService.findAllEmployee();
    }

    @GetMapping("/employees/{employeeId}")
    public Employee findById(@PathVariable int employeeId){
        Employee employee = employeeService.findEmployeeById(employeeId);

        if(employee == null){
            throw new RuntimeException("Employee Id Not Found:- "+employeeId);
        }

        return employee;
    }

    //Add Mapping for Post / Employees  - add new employee
    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee employee){
        employee.setId(0);
        return employeeService.saveEmployee(employee);
    }

    @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee employee){
        return employeeService.saveEmployee(employee);
    }

    @DeleteMapping("/employees/{employeeId}")
    public String deleteEmployee(@PathVariable int employeeId){

        Employee employee = employeeService.findEmployeeById(employeeId);

        if(employee == null){
            throw  new RuntimeException("EmployeeId: "+ employeeId +" Not Found!");
        }
        employeeService.deleteEmployeeById(employeeId);

        return "EmployeeId: "+employeeId+" Deleted!";
    }




}
