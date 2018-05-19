package com.javainuse.dao;


import com.javainuse.model.Employee;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
@Component
public class EmployeeDaoImplementation implements Employee_DAO {
    HashMap<String,Employee> employeeList;

    public EmployeeDaoImplementation(){
        employeeList=new HashMap<>();
    }





    @Override
    public void addEmployee(Employee emp) {
        employeeList.put(emp.getId(),emp);

    }

    @Override
    public boolean removeEmployee(Employee emp) {
        Employee deletedEmp;
        deletedEmp=employeeList.remove(emp.getId());
        if(deletedEmp==null)
        return false;

        return true;
    }

    @Override
    public Employee getEmployee(Employee emp) {
        return employeeList.get(emp.getId());
    }


    @Override
    public boolean updateEmployee(Employee emp) {
        Employee updateEmployee= employeeList.get(emp.getId());
        if(updateEmployee!=null){
            employeeList.put(emp.getId(),emp);
            return true;
        }

        return false;
    }

    @Override
    public Employee getEmployeeByID(String id) {
        return employeeList.get(id);

    }

    @Override
    public ArrayList printList() {

        Iterator<Employee> iterator= employeeList.values().iterator();
        ArrayList<Employee> arrayList= new ArrayList<>();
        while (iterator.hasNext()){
            arrayList.add(iterator.next());
        }
        return arrayList;
    }
}
