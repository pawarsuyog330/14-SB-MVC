package com.ashokit.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@GetMapping(value = "/index")
	public ModelAndView getWelcomePage()
	{
		ModelAndView mv =new ModelAndView("welcome", "user", "Guest");
		return mv;
	}
}
