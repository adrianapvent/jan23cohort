/**
 * 
 */
package com.codingdojo.omikujiform.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


/**
 * @author Adriana.Pena
 *
 */
@Controller
public class HomeController {

	// @Autowired
	// private <SERVICE_NAME> <service_name>;

	@GetMapping("/") // reserve route
	public String index() {
		return "index.jsp"; // map route to jsp
	}

	@PostMapping("/submit")
	public String submit(HttpSession session, @RequestParam(value = "num") int num,
			@RequestParam(value = "city") String city, @RequestParam(value = "person") String person,
			@RequestParam(value = "hobby") String hobby, @RequestParam(value = "animal") String animal,
			@RequestParam(value = "compliment") String compliment) {

		session.setAttribute("num", num);
		session.setAttribute("city", city);
		session.setAttribute("person", person);
		session.setAttribute("hobby", hobby);
		session.setAttribute("animal", animal);
		session.setAttribute("compliment", compliment);

		return "redirect:/show";
	}
	
	@RequestMapping("/show")
	public String show() {
		return "show.jsp";
	}
}
