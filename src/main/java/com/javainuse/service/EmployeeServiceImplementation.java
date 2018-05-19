package com.javainuse.service;


import com.javainuse.model.Employee;
import com.javainuse.dao.EmployeeDaoImplementation;
import com.javainuse.dao.Employee_DAO;
import com.javainuse.model.*;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class EmployeeServiceImplementation implements EmployeeService {

    private Employee_DAO employee_dao;


    public EmployeeServiceImplementation(){
        employee_dao=new EmployeeDaoImplementation();
    }
    @Override
    public void initializeDAO() {
        DateTimeFormatter formatter= DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String date="17/08/2016";
        LocalDate local =LocalDate.parse(date,formatter);
        //Employee 1
        Address address = new Address("villapark","chicago","60181","Illinois");
        Employee employee= new Employee("111","Manoj","Silwal","123456",80000,local);
        List<Permission> permissionList= Arrays.asList(Permission.ALL);
        Role role=new Role(Type.DIRECTOR,permissionList);
        Credentials credentials= new Credentials("111", "1234");
        employee.setAddress(address);
        employee.setRole(role);
        employee.setCredentials(credentials);


        //Employee 2
        Address address1 = new Address("villapark","chicago","60181","Illinois");
        Employee employee1= new Employee("111","Manoj","Silwal","123456",80000,local);
        List<Permission> permissionList1= Arrays.asList(Permission.ALL);
        Role role1=new Role(Type.DIRECTOR,permissionList);
        Credentials credentials1= new Credentials("111", "1234");
        employee1.setAddress(address1);
        employee1.setRole(role1);
        employee1.setCredentials(credentials1);
        //Employee 3
        Address address2= new Address("villapark","chicago","60181","Illinois");
        Employee employee2= new Employee("111","Manoj","Silwal","123456",80000,local);
        List<Permission> permissionList2= Arrays.asList(Permission.ALL);
        Role role2=new Role(Type.DIRECTOR,permissionList);
        Credentials credentials2= new Credentials("111", "1234");
        employee2.setAddress(address2);
        employee2.setRole(role2);
        employee2.setCredentials(credentials2);
        employee_dao.addEmployee(employee);
        employee_dao.addEmployee(employee1);
        employee_dao.addEmployee(employee2);
 }

    @Override
    public void addEmployee(Employee emp) {
        employee_dao.addEmployee(emp);

    }

    @Override
    public boolean removeEmployee(Employee emp) {
        return employee_dao.removeEmployee(emp);
    }

    @Override
    public Employee getEmployee(Employee emp) {
        return employee_dao.getEmployee(emp);
    }

    @Override
    public boolean updateEmployee(Employee emp) {
        return employee_dao.updateEmployee(emp);
    }

    @Override
    public Employee getEmployeeByID(String id) {
        return employee_dao.getEmployeeByID(id);
    }

    @Override
    public ArrayList printList() {

        return employee_dao.printList();
    }


}