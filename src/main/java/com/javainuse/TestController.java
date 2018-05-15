package com.javainuse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {

	@RequestMapping("/welcomeJSP")
	public ModelAndView firstPage() {
		String emp = "manoj";
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("welcome");
		modelAndView.addObject("employee", emp);
		return modelAndView;
	}

	@RequestMapping("/welcomeData")
	public String getData(){
		return "welcome";
	}


}
