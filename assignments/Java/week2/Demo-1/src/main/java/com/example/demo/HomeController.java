/**
 * 
 */
package com.example.demo;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Adriana.Pena
 *
 */
@Controller
public class HomeController {
	@RequestMapping("")
		public String index() {
			return "index.jsp";
		}
	
	@RequestMapping("list/{name}")
	public String list(@PathVariable String name, Model model) {
		ArrayList<String> locations = new ArrayList<>();
		locations.add("Berwick");
		locations.add("Seattle");
		
		model.addAttribute("allCities", locations);
		
		model.addAttribute("name", name); // a way to add variable
		
		return "list.jsp";
	}
}
