package com.example.employeeapi.service;

import com.example.employeeapi.model.Employee;

import java.util.List;

public interface EmployeeService {
    Employee createEmployee(Employee employee);

    List<Employee> getAllEmployee();

    boolean deleteEmployee(Long id);

    Employee getSingleEmployee(Long id);

    Employee updateEmployee(Long id, Employee employee);
}
