package controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import model.Hobby;
import model.Human;
import model.Job;

@Controller
public class HumanController {
	@ModelAttribute("hobbies") // 취미 목록
	public List<Hobby> hobby_list() {
		List<Hobby> lists = new ArrayList<Hobby>();
		lists.add(new Hobby("reading", "독서"));
		lists.add(new Hobby("movie", "영화 감상"));
		lists.add(new Hobby("baseball", "야구"));
		lists.add(new Hobby("football", "축구"));
		
		return lists;
	}
	
	@ModelAttribute("joblists") // 직업 목록
	public List<Job> job_list() {
		List<Job> lists = new ArrayList<Job>();
		lists.add(new Job(0, "-- 선택 해주세요. "));
		lists.add(new Job(1, "학생"));
		lists.add(new Job(2, "강사"));
		lists.add(new Job(3, "직원"));
		lists.add(new Job(4, "프로그래머"));
		
		return lists;
	}
	
	@ModelAttribute("speciallist") // 특기 목록
	public String[] speciallst() {
		String[] array = {"마라톤", "중국어", "아랍어"};
		
		return array;
	}
	
	@RequestMapping(value = "/mycaller.hm", method = RequestMethod.GET)
	public ModelAndView form() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("humanStart");
		
		return mav;
	}
	
	// GetMapping, PostMapping (Spring 4)
	
	@ModelAttribute("human")
	public Human some() {
		return new Human();
	}
	
	// @RequestParam(value="id", required = true) String id,  
	// @RequestParam(value="name", required = false) String name
	@RequestMapping(value = "/caller3.hm", method = RequestMethod.POST)
	public ModelAndView doPost(@ModelAttribute("human") @Valid Human human, BindingResult errors) {
		
		ModelAndView mav = new ModelAndView();
		System.out.println(human.toString());
		System.out.println(errors.toString());
		
		if (errors.hasErrors()) {
			mav.setViewName("humanStart");
			System.out.println("유효성 검사에 실패 했습니다.");
		} else {
			mav.setViewName("humanEnd");
			System.out.println("유효성 검사에 성공 했습니다.");
		}
		
		return mav;
	}
}
