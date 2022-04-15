package com.ml.savetravels.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ml.savetravels.models.Travel;
import com.ml.savetravels.services.TravelService;



@Controller
public class HomeController {
	
	private final TravelService travelServ; //injecting our TravelService
	
	//Here is the CONSTRUCTOR
	public HomeController(TravelService travelServ) {
		super();
		this.travelServ = travelServ;
	}
	
	//=========================================================================
	//Route to show all Travel Expenses
	//=========================================================================
	//Needs: Model model
	
	@GetMapping("/dashboard")
	public String dashboard(Model model) {
		
		//Send travel to JSP using Model model
		model.addAttribute("allTravels", travelServ.alltravels());
		
		return "dashboard.jsp";
	}
	
	
	//=========================================================================
	//Route to render the new Expense Form
	
	
	@GetMapping("/newExpense")
	public String newexpenseform(@ModelAttribute("travel")Travel travel) {
		
		return "newExpense.jsp";
	}
	

	//Route to PROCES the POST to create Travel Expense
	//=========================================================================
	@PostMapping("/processExpense")
	public String postingExpense(@Valid @ModelAttribute("travel") Travel travel, BindingResult result) {
		
		if (result.hasErrors()) {
			return "newExpense.jsp";
		}else {
			travelServ.createTravel(travel);
			
			return "redirect:/dashboard";
		}
		
	}
	//====================================================================================
	
	
	
	
	//=========================================================================
	//Route to show ONE Travel Expenses
	//=========================================================================
	@GetMapping("/oneExpense/{id}")
	public String oneexpense(@PathVariable("id") Long id, Model model) {
		model.addAttribute("travel", travelServ.findTravel(id));
		
		return "oneExpense.jsp";
	}
	

	//=========================================================================
	//Route to DELETE a Travel Expenses 
	//=========================================================================
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable("id")Long id) {
		travelServ.deleteTravel(id);
		return "redirect:/dashboard";
	}
	
	//=========================================================================
	//RENDER the UPDATE travel expense Form
	//=========================================================================
	@GetMapping("/updateExpense/{id}")
	public String updateExpenseForm(@PathVariable("id") Long id, @ModelAttribute("travel") Travel travel, Model model) {
		
		model.addAttribute("travel", travelServ.findTravel(id));
		return "updateExpense.jsp";
	}
	
	//=========================================================================
	//Process the POST to update Travel Expense
	//=========================================================================
	
	@RequestMapping(value="/updatingExpense/{id}", method=RequestMethod.PUT)
	public String updatingExpense(@Valid @ModelAttribute("travel") Travel travel, BindingResult result){
		
		if (result.hasErrors()) {
			return "updateExpense.jsp";
		}else {
			travelServ.createTravel(travel);
			
			return "redirect:/dashboard";
		}
		
	}
}
	
	


	
	
    

	
	
	
	
	
	
	

