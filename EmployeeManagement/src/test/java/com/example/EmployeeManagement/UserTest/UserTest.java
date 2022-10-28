package com.example.EmployeeManagement.UserTest;

import com.example.EmployeeManagement.Model.Employee;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class UserTest {

    @Test
    public void test01(){
        Employee employee = Mockito.mock(Employee.class);

        when(employee.getEmpName()).thenReturn(null);

        String setName = employee.setEmpName("Tej");

        String empname = employee.getEmpName();
        when(employee.getEmpName()).thenReturn(empname);

        assertEquals(setName, empname);
    }
    @Test
    public void test02(){
        Employee employee = Mockito.mock(Employee.class);

        when(employee.getEmpName()).thenReturn(null);

        List<String> list = new ArrayList<>();
        list.add("Tej");
        when(employee.getUserList()).thenReturn(list);
        System.out.println(list);
        assertEquals(list, employee.getUserList());
    }

    @Test
    public void test03(){
        Employee employee = Mockito.mock(Employee.class);

        when(employee.getEmpName()).thenReturn(null);

        Employee user = new Employee();

        String newObj = user.setEmpName("jon");

        String empname = user.getEmpName();
        System.out.println(newObj);
        when(employee.getEmpName()).thenReturn(newObj);

        assertEquals(newObj, empname);

    }

}
