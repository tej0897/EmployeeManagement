package com.example.EmployeeManagement.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;

@Entity
public class Employee {
    @Id
    private int empID;
    private String empName;
    private String password;

    List<String> userList;

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getEmpName() {
        return empName;
    }

    public String setEmpName(String empName) {
        this.empName = empName;
        return empName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String setPassword) {
        this.password = setPassword;
    }

    public Employee(int empID, String empName, String password) {
        this.empID = empID;
        this.empName = empName;
        this.password = password;
    }

    public Employee() {
    }

    public List<String> getUserList() {
        return userList;
    }

    public void setUserList(List<String> userList) {
        this.userList = userList;
    }
}
