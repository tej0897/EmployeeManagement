package com.example.EmployeeManagement.Controller;

import com.example.EmployeeManagement.Model.Employee;
import com.example.EmployeeManagement.Service.EmployeeService;
import com.example.EmployeeManagement.Service.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    // get user by ID

    @GetMapping("/findEmp/{empID}")
    public ResponseEntity<?> findEmp(@PathVariable("empID") int empID){
        Employee employee = employeeService.findEmpByID(empID);
        if (employee!=null){
            return new ResponseEntity<Employee>(employee, HttpStatus.OK);
        }
        return new ResponseEntity<String>("Employee Not Found",HttpStatus.NO_CONTENT);
    }


    // get all users
    @GetMapping("/getAllEmp")
    public ResponseEntity<?> getAllEmployees() {
        List<Employee> employeeList = employeeService.getAllEmployees();
        if (employeeList != null) {
            return new ResponseEntity<List>(employeeList, HttpStatus.OK);
        }
        return new ResponseEntity<String>("Employee List is empty", HttpStatus.NO_CONTENT);
    }




}
