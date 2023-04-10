/**
 * 
 */
package com.codingdojo.daikichiroutes;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Adriana.Pena
 *
 */
@RestController
@RequestMapping("/")
	public class HomeController {
		@RequestMapping("")
		public String index() {
			return "Welcome!";
		}
		
		
		@RequestMapping("/today")
	     // 3. Method that maps to the request route above
	     public String today() { // 3
	             return "Today you will find luck in all your endeavors!";
	     }
		
		
		@RequestMapping("/tomorrow")
	     // 3. Method that maps to the request route above
	     public String tomorrow() { // 3
	             return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!";
	     }
}
