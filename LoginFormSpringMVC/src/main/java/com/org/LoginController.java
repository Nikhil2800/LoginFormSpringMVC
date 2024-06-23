package com.org;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class LoginController {
	
	
	@RequestMapping("/login")
	public String login(Model model) {
		Student student = new Student();
		
		model.addAttribute("student", student);
		
		return "login-page";
	}
	
	@RequestMapping("/submitlogin")
	public String submitlog(@ModelAttribute("student") Student student) {
		return "confirmation-page";
	}

}
