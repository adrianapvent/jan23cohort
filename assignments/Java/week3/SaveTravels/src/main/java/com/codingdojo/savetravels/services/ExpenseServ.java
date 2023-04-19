/**
 * 
 */
package com.codingdojo.savetravels.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.savetravels.models.Expense;
import com.codingdojo.savetravels.repositories.ExpenseRepo;

/**
 * @author Adriana.Pena
 *
 */
@Service
public class ExpenseServ {
	@Autowired
	private ExpenseRepo expenseRepo;

	// returns all expenses
	public List<Expense> allExpenses() {
		return expenseRepo.findAll();
	}

	// creates an expense
	public Expense createExpense(Expense e) {
		return expenseRepo.save(e);
	}

	// updates an expense
	public Expense updateExpense(Expense e) {
		return expenseRepo.save(e);
	}

	// find an expense
	public Expense findExpense(Long id) {
		Optional<Expense> optionalExpense = expenseRepo.findById(id);
		if (optionalExpense.isPresent()) {
			return optionalExpense.get();
		}
		return null;
	}

	// delete an expense
	public void deleteExpense(Long id) {
		expenseRepo.deleteById(id);
	}

}
