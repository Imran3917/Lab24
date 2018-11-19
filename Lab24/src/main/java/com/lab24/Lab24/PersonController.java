package com.lab24.Lab24;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.lab24.Lab24.dao.CoffeeRepository;
import com.lab24.Lab24.dao.PersonRepository;
import com.lab24.Lab24.entity.Coffee;



@Controller
public class PersonController {

	@Autowired
	PersonRepository p;
	
	@Autowired
	CoffeeRepository c;

	@RequestMapping("/")
	public ModelAndView index() {
		return new ModelAndView("index", "coffeelist", c.findAll());

	}

	@RequestMapping("/addperson")
	public ModelAndView addNewPerson(@RequestParam("name") String name, @RequestParam("description") String description, @RequestParam("quantity") String quantity, @RequestParam("price") int price) {
		Coffee p1 = new Coffee(name, description, quantity, price);
		c.save(p1);
		return new ModelAndView("redirect:/");
	}
	
	@RequestMapping("/coffeeupdate")
	public ModelAndView updateMember(Coffee coffee) {
		c.save(coffee);
		return new ModelAndView("redirect:/");
	}
	
	@RequestMapping("/delete")
	public ModelAndView removePerson(@RequestParam("coffeename") String name) {
		c.deleteByname(name);
		return new ModelAndView("redirect:/");

	}


}
