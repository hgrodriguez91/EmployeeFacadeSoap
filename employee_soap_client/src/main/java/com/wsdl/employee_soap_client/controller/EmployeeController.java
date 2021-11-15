package com.wsdl.employee_soap_client.controller;

import com.wsdl.employee_soap_client.model.Employee;
import com.wsdl.employee_soap_client.model.EmployeeDTO;
import com.wsdl.employee_soap_client.service.EmployeeSoapService;
import com.wsdl.employee_soap_client.validator.EmployeeValid;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.function.EntityResponse;

import javax.websocket.server.PathParam;
import javax.xml.datatype.DatatypeConfigurationException;


@RestController
@RequestMapping("/employee")
public class EmployeeController {


    private static final Log LOG = LogFactory.getLog(EmployeeController.class);

    @Autowired
    @Qualifier("soapClientService")
    EmployeeSoapService service;

    @GetMapping
    public ResponseEntity<EmployeeDTO> addEmployeeRest(Employee employee) throws DatatypeConfigurationException {

        EmployeeValid valid = new EmployeeValid();
        if(valid.isValid(employee)){

            Employee soapEmp = service.addEmployee(employee);
            LOG.info("Desde el controller antes de responder "+soapEmp.toString());
            return new ResponseEntity<>(new EmployeeDTO(soapEmp), HttpStatus.OK) ;
        }else{
            return  new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
}
