package com.Test.Check.JavaGetAllAPI.Repository;


import com.Test.Check.JavaGetAllAPI.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
