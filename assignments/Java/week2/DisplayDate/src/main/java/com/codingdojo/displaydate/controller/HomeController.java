/**
 * 
 */
package com.codingdojo.displaydate.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Adriana.Pena
 *
 */
@Controller
public class HomeController {
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping("/date")
	public String date(Model model) {
		Date mydate = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("EEE MMM d zzz yyyy");
		String formattedDate =formatter.format(mydate);
		
		model.addAttribute("date", formattedDate);
		return "date.jsp";
	}
	
	@RequestMapping("/time")
	public String time(Model model) {
		Date mytime = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("h:mm a");
		String formattedDate =formatter.format(mytime);
		
		model.addAttribute("time", formattedDate);
		return "time.jsp";
	}
}
