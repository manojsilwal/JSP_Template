package com.javainuse;

import com.javainuse.model.Employee;
import com.javainuse.service.EmployeeServiceImplementation;
import com.javainuse.service.UserInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;


@Controller
public class TestController {
	@Autowired
	EmployeeServiceImplementation serviceImplementation;
	@Autowired
	UserInterface userInterface;
	@RequestMapping("/login")
	public ModelAndView login(@RequestParam String userId,@RequestParam String password){
		System.out.println("&&&&&&&&&&&&&&&&&&&&*******************&&&&&&&&&&&&&&&" +userId +password);
		serviceImplementation.initializeDAO();
		boolean result=userInterface.login(userId,password,serviceImplementation);
		ModelAndView modelAndView = new ModelAndView();
		if(result==true){
			ArrayList<Employee> arrayList= serviceImplementation.printList();
			modelAndView.setViewName("welcome");
			modelAndView.addObject("employee",arrayList);
		}
		return modelAndView;
	}

	@RequestMapping("/welcome")
	public String getData(){
		return "login";
	}

	@RequestMapping("/update" )
	public ModelAndView update(@PathVariable String id){
		Employee employee=  serviceImplementation.getEmployeeByID(id);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("update");
		modelAndView.addObject("updateEmployee",employee);
		return modelAndView;

		}
}






