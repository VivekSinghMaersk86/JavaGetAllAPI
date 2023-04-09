package com.Test.Check.JavaGetAllAPI.Controller;

import com.Test.Check.JavaGetAllAPI.Entity.Employee;
import com.Test.Check.JavaGetAllAPI.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class FindAllObject {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/test")
    public String testMethod() {
        return "testCheckController";
    }

    @RequestMapping(value = "/AllEmplList", method = RequestMethod.GET)
    public ResponseEntity<?> getAllEmployee() throws Exception {
        java.util.List<Employee> EmployeeResponseList  = employeeService.getAllEmployee();
        return new ResponseEntity<List<Employee>>(EmployeeResponseList , HttpStatus.OK);
    }



}
