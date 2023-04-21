package com.codingdojo.loginreg.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.codingdojo.loginreg.services.UserServ;

@Controller
public class HomeController {
	@Autowired
	private UserServ userServ;
	
	@GetMapping("/")
	public String index(HttpSession session, Model model) {
		if(session.getAttribute("userID") == null) {
			return "redirect:/logReg";
		}
		
		model.addAttribute("user", userServ.getOne((Long)session.getAttribute("userID")));
		return "index.jsp";
	}

}
