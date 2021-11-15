package com.wsdl.employee_soap_client.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import org.springframework.format.annotation.DateTimeFormat;


import java.util.Date;


public class Employee {


    private String names;

    private String lastName;

    private String documentType;

    private String documentNumber;

    @JsonFormat(pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern = "yyyy-MM-dd")

    private Date birthday;

    @JsonFormat(pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern = "yyyy-MM-dd")

    private Date boindingJob;


    private String jobPosition;

    private double payRate;

    public Employee() {
    }

    public Employee(String names, String lastName, String documentType, String documentNumber, Date birthday, Date boindingJob, String jobPosition, double payRate) {
        this.names = names;
        this.lastName = lastName;
        this.documentType = documentType;
        this.documentNumber = documentNumber;
        this.birthday = birthday;
        this.boindingJob = boindingJob;
        this.jobPosition = jobPosition;
        this.payRate = payRate;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Date getBoindingJob() {
        return boindingJob;
    }

    public void setBoindingJob(Date boindingJob) {
        this.boindingJob = boindingJob;
    }

    public String getJobPosition() {
        return jobPosition;
    }

    public void setJobPosition(String jobPosition) {
        this.jobPosition = jobPosition;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "names='" + names + '\'' +
                ", lastName='" + lastName + '\'' +
                ", documentType='" + documentType + '\'' +
                ", documentNumber='" + documentNumber + '\'' +
                ", birthday=" + birthday +
                ", boindingJob=" + boindingJob +
                ", jobPosition='" + jobPosition + '\'' +
                ", payRate=" + payRate +
                '}';
    }
}
