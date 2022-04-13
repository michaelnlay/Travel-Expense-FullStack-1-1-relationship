package com.ml.javaspringtemplate;




import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller 
//this annotation is for return render for user to view
public class HomeController {
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
		
	}
	//==========================================================================
	//FORM SESSION
	//==========================================================================
	@RequestMapping("/omikuji") //1st.Start off with rendering route 
	public String form() {
		
		return "omikuji.jsp";
	}
	
//	ReqMapping is used for mapping web requests onto methods in request-handling classess
	@RequestMapping(value="/omikuji/process", method=RequestMethod.POST)
	public String process(
			HttpSession session,
			@RequestParam(value="number") String number,
			@RequestParam(value="city") String city,
			@RequestParam(value="person") String person,
			@RequestParam(value="hobby") String hobby,
			@RequestParam(value="animal") String animal,
			@RequestParam(value="description") String description
			) {
		//use setAttribute to stash or store session info by assigning a key-value pair 
		session.setAttribute("number", number);
		session.setAttribute("city", city); 
		session.setAttribute("person", person); 
		session.setAttribute("hobby", hobby); 
		session.setAttribute("animal", animal); 
		session.setAttribute("description", description); 
		
		
		return "redirect:/omikuji/show"; //redirect to the route
	}
	
	@RequestMapping("/omikuji/show") //1st.Start off with rendering route 
	public String show(
			Model model,
			HttpSession session) {
		String number = (String) session.getAttribute("number");
		String city = (String) session.getAttribute("city");
		String person = (String) session.getAttribute("person");
		String hobby = (String) session.getAttribute("hobby");
		String animal = (String) session.getAttribute("animal");
		String description = (String) session.getAttribute("description");
		
		model.addAttribute("number", number);
		model.addAttribute("city", city);
		model.addAttribute("person", person);
		model.addAttribute("hobby", hobby);
		model.addAttribute("animal", animal);
		model.addAttribute("description", description);
		
		System.out.println("In " + number + "years, you will live in " + city + "with "+  person +"as your partner, selling/doing " + hobby + "for living. "+ "The next time you see a " + animal + " ,you will have good luck." + "Also, " +description);
		
//		return "omikuji_show.jsp";
		return "show.jsp";
		
	}
	
	
	
}


	
	//Michael you can do it==================================================
	
	
	//==================================================================
	
	
	//=============================================================
	//POST AND FORM session
	//============================================================
	/*@RequestMapping("/form")
	public String form(
			HttpSession session,
			Model model) { //this model is refer to the domain model from the front end
		String intro =(String) session.getAttribute("intro");
//		System.out.println(intro); //this is from session below
		
		model.addAttribute("intro",intro);
		return "form.jsp";
	}
	
	@RequestMapping(value="/process", method=RequestMethod.POST)
	public String process(
			@RequestParam(value="name") String name,
			@RequestParam(value="email") String email,
			@RequestParam(value="password") String password,
			HttpSession session
			) {
		
		String intro ="Hello, my name is" + name  + "and my email is" + email + "and my password is" + password;
		session.setAttribute("intro",intro);
//		System.out.println(intro);
		return "redirect:/form";
	}
	
	
	
	
	
//	@RequestMapping("/dojos")
//    public String loop(Model model) {
//        ArrayList<String> dojos = new ArrayList<String>();
//        dojos.add("Burbank");
//        dojos.add("Chicago");
//        dojos.add("Bellevue");
//        model.addAttribute("dojosFromMyController", dojos);
//        return "index.jsp";
//    }
//	@RequestMapping("/fruity")
//	public String fruitController(Model model) {
//		model.addAttribute("fruit","Orange");
//		return "index.jsp";
//		
//	}
//	
//	@RequestMapping("/user")
//	public String user(Model model) {
//		String fName = "Michael";
//		String lName ="Lay";
//		String email ="michael@gmail.com";
//		Integer age =111;
//		
//		model.addAttribute("first_name",fName);
//		model.addAttribute("last_name",lName);
//		model.addAttribute("email",email);
//		model.addAttribute("age",age);
//		
//		return "index.jsp";
//		
//	}
//	// ...
//    
//// ...


	
	}
	*/