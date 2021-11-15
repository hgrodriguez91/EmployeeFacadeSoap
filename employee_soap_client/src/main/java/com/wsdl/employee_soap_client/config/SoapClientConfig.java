package com.wsdl.employee_soap_client.config;

import com.wsdl.employee_soap_client.service.EmployeeSoapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class SoapClientConfig {


    @Autowired
    @Qualifier("soapClientService")
    private EmployeeSoapService employeeSoapService;

    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("employee_soap_client.employee.wsdl");
        return marshaller;
    }

    @Bean
    public EmployeeSoapService soapClient(Jaxb2Marshaller marshaller) {
        employeeSoapService.setMarshaller(marshaller);
        employeeSoapService.setUnmarshaller(marshaller);
        return employeeSoapService;
    }

}
