/**
 * 
 */
package com.codingdojo.savetravels.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.codingdojo.savetravels.models.Expense;
import com.codingdojo.savetravels.services.ExpenseServ;

/**
 * @author Adriana.Pena
 *
 */
@Controller
public class HomeController {

		@Autowired
		ExpenseServ expenseServ;

		@GetMapping("/")
		public String index(@ModelAttribute("expense") Expense expense, Model model) {
			List<Expense> allExpenses = expenseServ.allExpenses();
			model.addAttribute("allExpenses", allExpenses);
			return "index.jsp";
		}

		@PostMapping("/expense/create")
		public String createExpense(@Valid @ModelAttribute("expense") Expense expense, BindingResult result, Model model) {
			if (result.hasErrors()) {
				List<Expense> allExpenses = expenseServ.allExpenses();
				model.addAttribute("allExpenses", allExpenses);
				return "index.jsp";
			}
			expenseServ.createExpense(expense);
			return "redirect:/";
		}

		@GetMapping("/expense/edit/{id}")
		public String editExpense(@PathVariable(value = "id") Long id, Model model) {
			model.addAttribute("expense", expenseServ.findExpense(id));
			if (expenseServ.findExpense(id) == null) {
				return "redirect:/";
			}
			return "edit.jsp";
		}

		@PutMapping("/expense/update/{id}")
		public String updateExpense(@PathVariable(value = "id") Long id, @Valid @ModelAttribute("expense") Expense expense,
				BindingResult result) {
			if (result.hasErrors()) {
				return "edit.jsp";
			}
			expenseServ.updateExpense(expense);
			return "redirect:/";
		}

		@DeleteMapping("/expense/delete/{id}")
		public String deleteExpense(@PathVariable(value = "id") Long id) {
			expenseServ.deleteExpense(id);
			return "redirect:/";
		}
		
		@GetMapping("expense/view/{id}")
		public String viewExpense(@PathVariable(value="id") Long id, Model model) {
			if(expenseServ.findExpense(id) == null)
			{
				return "redirect:/";
			}
			model.addAttribute("expense", expenseServ.findExpense(id));
			return "view.jsp";
		}
}



