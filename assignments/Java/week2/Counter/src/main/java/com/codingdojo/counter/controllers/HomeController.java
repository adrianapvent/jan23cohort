/**
 * 
 */
package com.codingdojo.counter.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Adriana.Pena
 *
 */
@Controller
public class HomeController {
	
//	@RequestMapping("/")
//	public String index(HttpSession session) {        
//		session.setAttribute("count", 0);
//		return "index.jsp";
//	}
	
	@RequestMapping("/")
	public String index(HttpSession session, Model model) {
		Object sessionCount = session.getAttribute("count");
		if(sessionCount == null) {
			session.setAttribute("count", 0);
		}
		session.setAttribute("count", (Integer) session.getAttribute("count") +1 );
		model.addAttribute("count", session.getAttribute("count"));
		
		return "index.jsp";
	}
	
	@RequestMapping("/counter")
	public String counter() {
		return "index.jsp";
	}
	
	@RequestMapping("/clear") 
	public String clear(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}
}
