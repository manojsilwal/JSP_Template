package com.javainuse.service;

import com.javainuse.model.Employee;

import java.util.ArrayList;

public interface EmployeeService {
    public void addEmployee(Employee emp);
    public boolean removeEmployee(Employee emp);
    public Employee getEmployee (Employee emp);
    public boolean updateEmployee(Employee emp);
    public Employee getEmployeeByID(String id);
    public ArrayList printList();
    public void initializeDAO();
}
