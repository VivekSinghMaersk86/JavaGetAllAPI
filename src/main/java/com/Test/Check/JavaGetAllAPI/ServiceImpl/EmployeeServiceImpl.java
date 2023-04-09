package com.Test.Check.JavaGetAllAPI.ServiceImpl;

import com.Test.Check.JavaGetAllAPI.Entity.Employee;
import com.Test.Check.JavaGetAllAPI.Repository.EmployeeRepository;
import com.Test.Check.JavaGetAllAPI.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("employeeService")
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getAllEmployee() {
        List<Employee> Emplist=employeeRepository.findAll();
        return Emplist;
    }
}
