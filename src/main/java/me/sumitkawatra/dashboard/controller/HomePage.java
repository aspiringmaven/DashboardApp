package me.sumitkawatra.dashboard.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomePage {
	
	@RequestMapping({"/","home"})
	public String homePage() {
		return "index";
	}	
}