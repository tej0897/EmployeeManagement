package com.example.EmployeeManagement.Service;

import com.example.EmployeeManagement.Model.Employee;

import java.util.List;

public interface EmployeeService {

    public List<Employee> getAllEmployees();
    public Employee addEmployee(Employee employee);
    public boolean deleteEmployee( int empID);
    public boolean updateEmployee(Employee employee);
//    public Employee findEmpByID(int empID);
}

