package controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/first")
public class HelloController {
	
	@RequestMapping(value="/caller1.he", method=RequestMethod.GET)
	public String home(Model model) {
		model.addAttribute("greeting", "여러분 안녕하세요!");
		model.addAttribute("message", "1월이 다 끝나 갑니다T_T");
		return "hello";
	}
	
	// 주로 ModelAndView 활용
	@RequestMapping(value="hohoho.he", method=RequestMethod.GET)
	public ModelAndView hohoho() {
		ModelAndView mav = new ModelAndView("hohoho");
		
		mav.addObject("hohoho", "안녕하세요!");
		
		List<String> lists = new ArrayList<String>();
		
		lists.add("A");
		lists.add("B");
		lists.add("C");
		
		mav.addObject("lists", lists);
		
		return mav;
	}
	
	@RequestMapping(value="/hahaha.he", method=RequestMethod.GET)
	public String hahaha() {
		return ":)";
	}
	
}
