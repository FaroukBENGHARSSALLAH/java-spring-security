package com.farouk.bengarssallah.java.spring.security.annotation.controller;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.ui.Model;

import org.springframework.stereotype.Controller;

@Controller
public class HomeController {


	@RequestMapping({ "/", "/welcome" })
	public String getHomePage(final Model model) {
		
		model.addAttribute("view", "welcome");
		return "welcome";
	}

	private String getPrincipal() {
		String userName = null;
		final Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		if (principal instanceof UserDetails) {
			userName = ((UserDetails) principal).getUsername();
		} else {
			userName = principal.toString();
		}
		return userName;
	}
}
