package in.jt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import in.jt.bind.User;

@Controller
public class UserController {
	@GetMapping("/loaduser/{uname}")
	public String getUserForm(@PathVariable String uname, Model model) {
		System.out.println("**************");
		model.addAttribute("message", "WELCOME TO JAVA TECHNIQUES: "+uname);
		return "index";
	}
	
	@GetMapping("/getUser")
	public String getUserForm( Model model) {
		User userObj = new User();
		userObj.setUname("Ramchandra");
		userObj.setEmail("Ramchandra@gmail.com");
		model.addAttribute("user", userObj);
		return "userinfo";
	}
}
