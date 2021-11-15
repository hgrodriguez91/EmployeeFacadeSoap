package com.wsdl.employee_soap_client.service;

import com.wsdl.employee_soap_client.controller.EmployeeController;
import com.wsdl.employee_soap_client.model.Employee;
import employee_soap_client.employee.wsdl.AddEmployeeRequest;
import employee_soap_client.employee.wsdl.AddEmployeeResponse;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import java.util.GregorianCalendar;


@Service("soapClientService")
public class EmployeeSoapService extends WebServiceGatewaySupport {

    public static final String ENDPOINT_URI ="http://localhost:8080/ws/";

    private static final Log LOG = LogFactory.getLog(EmployeeSoapService.class);

    public Employee addEmployee(Employee employee) throws DatatypeConfigurationException {
        AddEmployeeRequest request = new AddEmployeeRequest();
        BeanUtils.copyProperties(employee,request);
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTime(employee.getBirthday());
        request.setBirthday(DatatypeFactory.newInstance()
                .newXMLGregorianCalendar(calendar));
        calendar.setTime(employee.getBoindingJob());
        request.setBoindingJob(DatatypeFactory.newInstance()
                .newXMLGregorianCalendar(calendar));
        LOG.info("Desde el service antes de hacer peticion : "+ request.toString());
        AddEmployeeResponse response = (AddEmployeeResponse) getWebServiceTemplate().marshalSendAndReceive(ENDPOINT_URI,request);
        LOG.info("Respuesta de SOAP : "+ response.getEmployeeType().toString());
        Employee empResponse = new Employee();
        BeanUtils.copyProperties(response.getEmployeeType(), empResponse);
        empResponse.setBirthday(response.getEmployeeType().getBirthday().toGregorianCalendar().getTime());
        empResponse.setBoindingJob(response.getEmployeeType().getBoindingJob().toGregorianCalendar().getTime());
        LOG.info("Copiado para responder : "+ empResponse.toString());
        return empResponse;
    }

}
