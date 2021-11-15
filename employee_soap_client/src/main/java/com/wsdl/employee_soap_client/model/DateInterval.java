package com.wsdl.employee_soap_client.model;

public class DateInterval {

    private int years;
    private int months;
    private int days;

    public DateInterval() {
    }

    public DateInterval(int years, int months, int days) {
        this.years = years;
        this.months = months;
        this.days = days;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public int getMonths() {
        return months;
    }

    public void setMonths(int months) {
        this.months = months;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    @Override
    public String toString() {
        return "DateInterval{" +
                "years=" + years +
                ", months=" + months +
                ", days=" + days +
                '}';
    }
}
