package com.example.EmployeeManagement.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
    @Id
    private int empID;
    private String empName;
    private String empMailID;

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpMailID() {
        return empMailID;
    }

    public void setEmpMailID(String empMailID) {
        this.empMailID = empMailID;
    }

    public Employee(int empID, String empName, String empMailID) {
        this.empID = empID;
        this.empName = empName;
        this.empMailID = empMailID;
    }

    public Employee() {
    }
}
