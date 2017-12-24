package com.learnspring.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloFriendController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return "index";
    }
	
    @RequestMapping("/hello")
    public String helloFriend(Model model, @RequestParam(value="name", required=false, defaultValue="Friend") String name) {
        
        String message="Welcome To Spring Boot With Thymeleaf Demo Application.";
        model.addAttribute("name", name + " , I am running in cloud environment.");
        model.addAttribute("message", message);
        
        return "hello";
    }
}
