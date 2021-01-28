package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import model.Human;

@Controller
public class HumanController {
	@RequestMapping(value = "/mycaller.hr", method = RequestMethod.GET)
	public ModelAndView form() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("humanStart");
		
		return mav;
	}
	
	// GetMapping, PostMapping
	
	// @RequestParam(value="id", required = true) String id,  
	// @RequestParam(value="name", required = false) String name
	@RequestMapping(value = "/caller3.hm", method = RequestMethod.POST)
	public ModelAndView doPost(Human human) {
		
		ModelAndView mav = new ModelAndView();
	
		System.out.println(human.toString());
	
		mav.setViewName("humanEnd");
		
		return mav;
	}
}
