package com.service.wsdl.employeeSoap.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    long id;

    @Column(name = "names")
    String names;

    @Column(name = "last_name")
    String last_name;

    @Column(name = "document_type")
    String document_type;

    @Column(name = "document_number")
    String document_number;

    @Column(name = "birthday")
    Date birthday;

    @Column(name = "job_date")
    Date job_date;

    @Column(name = "job_position")
    String job_position;

    @Column(name = "pay_rate")
    Double pay_rate;


    public Employee() {
    }

    public Employee(String names, String last_name, String document_type, String document_number, Date birthday, Date job_date, String job_position, Double pay_rate) {
        this.names = names;
        this.last_name = last_name;
        this.document_type = document_type;
        this.document_number = document_number;
        this.birthday = birthday;
        this.job_date = job_date;
        this.job_position = job_position;
        this.pay_rate = pay_rate;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getDocument_type() {
        return document_type;
    }

    public void setDocument_type(String document_type) {
        this.document_type = document_type;
    }

    public String getDocument_number() {
        return document_number;
    }

    public void setDocument_number(String document_number) {
        this.document_number = document_number;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Date getJob_date() {
        return job_date;
    }

    public void setJob_date(Date job_date) {
        this.job_date = job_date;
    }

    public String getJob_position() {
        return job_position;
    }

    public void setJob_position(String job_position) {
        this.job_position = job_position;
    }

    public Double getPay_rate() {
        return pay_rate;
    }

    public void setPay_rate(Double pay_rate) {
        this.pay_rate = pay_rate;
    }

}
