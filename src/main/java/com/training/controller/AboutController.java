package com.training.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Controller
@EnableWebMvc
@RequestMapping(value = "/about")
public class AboutController {
	
	@RequestMapping(value = "/app")
	public String aboutPage() {
		return "about";
	}
}
