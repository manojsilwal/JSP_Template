package com.javainuse.service;

import com.javainuse.model.Employee;
import org.springframework.stereotype.Component;

@Component
public class UserInterface {

    public boolean login(String userId, String password, EmployeeService employeeService){
        Employee employee=employeeService.getEmployeeByID(userId);
        if(employee==null){
            System.out.println("User Id not found!");
            return false;
        }

        if(employee.getCredentials().getUserName().equals(userId)&&
                employee.getCredentials().getPassword().equals(password)){
            return true;
        }
        else  if(employee.getCredentials().getUserName().equals(userId)){
            System.out.println("Invalid password");
            return false;
        }
        else if(employee.getCredentials().getPassword().equals(password)){
            System.out.println("Invalid user Id");
            return false;
        }
        else
            System.out.println("User Id and Password is incorrect! Try Again");
        return false;

    }
}
