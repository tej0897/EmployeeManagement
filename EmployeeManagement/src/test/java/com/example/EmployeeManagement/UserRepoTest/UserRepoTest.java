package com.example.EmployeeManagement.UserRepoTest;

import com.example.EmployeeManagement.Model.Employee;
import com.example.EmployeeManagement.Repository.EmployeeRepo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

@DataJpaTest
@AutoConfigureMockMvc
public class UserRepoTest {

    @Autowired
    private EmployeeRepo employeeRepo;

    private Employee employee = new Employee();

    @BeforeEach
    public void init(){
//        List<String> empList = new ArrayList<>();
        employee.setEmpID(101);
        employee.setEmpName("Kumar");
//        employee.setPassword("abc");
//        employee.setUserList(empList);
    }

    @Test
    public void saveUserTest() throws Exception{
        Employee employee1 = null;

        employeeRepo.save(employee);

        employee1 = employeeRepo.findById(employee.getEmpID()).get();
        assertEquals(employee.getEmpName(), employee1.getEmpName());
    }

    @Test
    public void saveUserTestFail() throws Exception{
        Employee employee1 = null;

        employeeRepo.save(employee);

        employee1 = employeeRepo.findById(employee.getEmpID()).get();
        assertNull(employee1);
    }
}
