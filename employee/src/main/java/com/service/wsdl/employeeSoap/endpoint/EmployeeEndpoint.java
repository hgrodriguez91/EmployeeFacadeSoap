package com.service.wsdl.employeeSoap.endpoint;

import com.service.wsdl.employeeSoap.service.EmployeeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import  com.service.wsdl.employeeSoap.wsdl.AddEmployeeRequest;
import  com.service.wsdl.employeeSoap.wsdl.AddEmployeeResponse;
import  com.service.wsdl.employeeSoap.wsdl.Employee;

@Endpoint
public class EmployeeEndpoint {

    public static final String NAMESPACE_URI = "https://service.employee.com/employee-ws";

    @Autowired
    @Qualifier("employeeService")
    private EmployeeService employeeService;

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "AddEmployeeRequest")
    @ResponsePayload
    public AddEmployeeResponse addEmployee(@RequestPayload AddEmployeeRequest employeeRequest){
        //Object AddEmployeeResponse Type
        AddEmployeeResponse response = new AddEmployeeResponse();
        // Create a Entity Employee Object instance
        com.service.wsdl.employeeSoap.entity.Employee empEntity = new com.service.wsdl.employeeSoap.entity.Employee();
        //Copy Request type to Entity Type
        BeanUtils.copyProperties(employeeRequest, empEntity);
        //Save Entity and Copy result to Response Type Object
        Employee employee = new Employee();
        BeanUtils.copyProperties(employeeService.addEmployee(empEntity),employee);
        response.setEmployee(employee);

        return response;
    }

}
