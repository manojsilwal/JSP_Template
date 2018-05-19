package com.javainuse.model;



import com.javainuse.model.Address;
import com.javainuse.model.Credentials;
import com.javainuse.model.Role;

import java.time.LocalDate;

public class Employee {
    private String id;
    private String firstName;
    private String  lastName;
    private String socialSecurityNumber;
    private LocalDate hireDay;
    private double salary;
    private Address address;
    private Credentials credentials;
    private Role role;

    public Employee(){}

    public Employee(String id, String firstName, String lastName, String socialSecurityNumber, double salary, LocalDate hireDay) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.salary=salary;
        this.hireDay = hireDay;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirsName() {
        return firstName;
    }

    public void setFirsName(String firsName) {
        this.firstName = firsName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public void setHireDay(LocalDate hireDay) {
        this.hireDay = hireDay;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Credentials getCredentials() {
        return credentials;
    }

    public void setCredentials(Credentials credentials) {
        this.credentials = credentials;
    }

    public Role getRole() {
        return role;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public void setRole(Role role) {
        this.role = role;
    }
    private String format="Id= %s, firstName= %s, lastName=%s, ssn=%s, hireDay=%s, Address=%s,role=%s";

    public String toString(){
    return String.format(format,id,firstName,lastName,socialSecurityNumber,salary, address.toString(),role.toString());
    }

}

