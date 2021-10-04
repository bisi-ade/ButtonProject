package com.bi.buttonproject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	
	@RequestMapping("/")
	public String index(Model model) {
		model.addAttribute("name", "adebisi");
		return "index.jsp";
	}
	
}
