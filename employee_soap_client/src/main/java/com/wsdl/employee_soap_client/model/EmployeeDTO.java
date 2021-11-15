package com.wsdl.employee_soap_client.model;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class EmployeeDTO {

    private Employee employee;
    private DateInterval time_job_position;
    private DateInterval employee_age;
    private Log LOG = LogFactory.getLog(EmployeeDTO.class);

    public EmployeeDTO() {
    }

    public EmployeeDTO(Employee employee) {
        this.employee = employee;
        Period job_period = this.calculate_interval(this.employee.getBoindingJob());
        LOG.info("Constructor Job Position : "+ job_period.getYears() );
        this.time_job_position = new DateInterval(job_period.getYears(),job_period.getMonths(),job_period.getDays());
      /*  this.time_job_position.setMonths(job_period.getMonths());
        this.time_job_position.setDays(job_period.getDays());*/
        LOG.info("Date Interval" + this.time_job_position.toString());
        Period age = this.calculate_interval(this.employee.getBirthday());
        this.employee_age = new DateInterval(age.getYears(),age.getMonths(),age.getDays());

    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public DateInterval getTime_job_position() {
        return time_job_position;
    }

    public void setTime_job_position(DateInterval time_job_position) {
        this.time_job_position = time_job_position;
    }

    public DateInterval getEmployee_age() {
        return employee_age;
    }

    public void setEmployee_age(DateInterval employee_age) {
        this.employee_age = employee_age;
    }

    private Period calculate_interval(Date date){
       // DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LOG.info("Entro a la funcion");
        Instant instant = date.toInstant();
        ZonedDateTime zdt = instant.atZone(ZoneId.systemDefault());
        LocalDate first = zdt.toLocalDate();
        LocalDate now = LocalDate.now();
        Period period = Period.between(first, now);
        LOG.info("Years" + period.getYears());

        return period;
    }
}
