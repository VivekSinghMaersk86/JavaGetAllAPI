package com.Test.Check.JavaGetAllAPI.Service;

import com.Test.Check.JavaGetAllAPI.Entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

public interface EmployeeService {

    List<Employee> getAllEmployee();
}
