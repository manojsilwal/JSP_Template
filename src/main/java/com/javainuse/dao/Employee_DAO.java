package com.javainuse.dao;


import com.javainuse.model.Employee;

import java.util.ArrayList;

public interface Employee_DAO {
    public void addEmployee(Employee emp);
    public boolean removeEmployee(Employee emp);
    public Employee getEmployee (Employee emp);
    public boolean updateEmployee(Employee emp);
    public Employee getEmployeeByID(String id);
    public ArrayList printList();



}
