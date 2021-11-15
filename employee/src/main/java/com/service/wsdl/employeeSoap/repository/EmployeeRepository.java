package com.service.wsdl.employeeSoap.repository;

import com.service.wsdl.employeeSoap.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository("employeeRepo")
public interface EmployeeRepository extends JpaRepository<Employee, Serializable> {

}
