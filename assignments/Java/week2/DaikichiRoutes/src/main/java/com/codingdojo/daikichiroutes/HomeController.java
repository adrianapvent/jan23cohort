/**
 * 
 */
package com.codingdojo.daikichiroutes;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Adriana.Pena
 *
 */
@Controller
@RequestMapping("/daikichi")
public class HomeController {
	@RequestMapping
	public String welcome() {
		return "index.jsp";
	}
}
