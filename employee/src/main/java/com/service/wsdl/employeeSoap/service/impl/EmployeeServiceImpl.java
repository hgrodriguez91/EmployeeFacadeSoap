package com.service.wsdl.employeeSoap.service.impl;

import com.service.wsdl.employeeSoap.entity.Employee;
import com.service.wsdl.employeeSoap.repository.EmployeeRepository;
import com.service.wsdl.employeeSoap.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("employeeService")
public class EmployeeServiceImpl  implements EmployeeService {

    @Autowired
    @Qualifier("employeeRepo")
    private EmployeeRepository employeeRepository;


    @Override
    public Employee addEmployee( Employee employee) {

        Employee empResult = new Employee();
        empResult = employeeRepository.save(employee);
        return empResult;
    }

}
