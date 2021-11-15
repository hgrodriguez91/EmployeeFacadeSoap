package com.wsdl.employee_soap_client.validator;

import com.wsdl.employee_soap_client.model.Employee;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class EmployeeValid {


    public EmployeeValid() {
    }

    public boolean isValid(Employee employee) {

        if (employee.getNames()== null || employee.getLastName()==null || employee.getDocumentType() == null
        || employee.getDocumentNumber()== null || employee.getBirthday()== null || employee.getBoindingJob()== null
        || employee.getJobPosition()== null ){
            return false;
        }
        if(!validAge(employee.getBirthday())){
            return false;
        }

    return true;
    }

    private boolean validAge(Date date){
        Instant instant = date.toInstant();
        ZonedDateTime zdt = instant.atZone(ZoneId.systemDefault());
        LocalDate first = zdt.toLocalDate();
        LocalDate now = LocalDate.now();
        Period period = Period.between(first, now);
       if (period.getYears()<18)
           return false;
        return true;
    }
}
