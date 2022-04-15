package com.ml.fullcrud.controllers;

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

import com.ml.fullcrud.models.Candy;
import com.ml.fullcrud.services.CandyService;

//no longer want RestController for RawData

//@RestController
//we want a controller to render jsp

@Controller
public class HomeController {
	
	private final CandyService candyServ;
	public HomeController(CandyService candyServ) {
		super();
		this.candyServ = candyServ;
	}
	
	
    
	//ROUTE to show all candies
	//Needs: Model model, 

	@GetMapping("/dashboard")
	public String dashboard(
			Model model) {
		
		//Send our Candies to the JSP using Model model
		model.addAttribute("allCands", candyServ.allCandys());
		return "dashboard.jsp";
	}
	
	//ROUTE to make a Candy====================================================================
	
	
	//RENDER the new candy Form==========================================================
	//boilder plate to check if thing is working before moving on
	@GetMapping("/newCandy")
	public String newCandyForm(
			@ModelAttribute("candy") Candy candy) {
		return "newCandy.jsp";
	}
	
	
	
	
	//PROCESS the POST to create Candy===================================================
	@PostMapping("/processCandy")
	public String postingCandy(
			@Valid @ModelAttribute("candy") Candy candy, BindingResult result) {
		if (result.hasErrors()) {
			return "newCandy.jsp";
		}else {
			candyServ.createCandy(candy);
			return "redirect:/dashboard";
		}
		
		
	}
	
	
	//ROUTE to show one Candy
	//boilder plate to check if thing is working before moving on
	@GetMapping("/oneCandy/{id}")
	public String oneCandy(Model model,
			@PathVariable(value="id") Long id) {
		Candy candy = candyServ.findCandy(id);
		model.addAttribute("candy", candy);
		return "oneCandy.jsp";
	}
	
	//Route to Delete a Candy
	//boilder plate to check if thing is working before moving on
	@GetMapping("/delete/{id}")
	public String delete(
			@PathVariable(value="id") Long id) {
		candyServ.candyMan(id);
		return "redirect:/dashboard";
	}
	

	
	//====================================UPDATE=============================
	//ROUTES to Update a Candy
	
	//Render the update Candy Form
	//Don't forget to add id
	@GetMapping("/updateCandy/{id}")
	public String updateCandyForm(@PathVariable("id") Long id, @ModelAttribute("candy") Candy candy, Model model) {
		
		model.addAttribute("candy", candyServ.findCandy(id));
		
		return "updateCandy.jsp";
	}
	
	//Process the Post to Update Candy
	@RequestMapping(value="/updatingCandy/{id}", method=RequestMethod.PUT)
	public String updatingCandy(@Valid @ModelAttribute("candy") Candy candy, BindingResult result) {
		if(result.hasErrors()) {
			return "updateCandy.jsp";
		}else {
			candyServ.updateCandy(candy);
			return "redirect:/dashboard";
			
		}
	}
    
  
    
 
}
	
	
	
	
	
	
	
	
	

