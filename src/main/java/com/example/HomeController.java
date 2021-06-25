package com.example;

import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.model.Alien;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String home() {
		return "index";
	}
	
	//normal servlet request get the input parameter
	
//	@RequestMapping("/add")
//	public String add(HttpServletRequest req) {
//		int i = Integer.parseInt(req.getParameter("num1"));
//		int j = Integer.parseInt(req.getParameter("num2"));
//		int k = i+j;
//		HttpSession session = req.getSession();
//		session.setAttribute("sum", k);
//		return "result.jsp";
//	}
	
//	@RequestMapping("/add")
//	public String add(@RequestParam("num1") int i, @RequestParam("num2") int j, HttpSession session) {
//		int k = i+j;
//		session.setAttribute("sum", k);
//		return "result.jsp";
//	}
	
//	@RequestMapping("/add")
//	public ModelAndView add(@RequestParam("num1") int i, @RequestParam("num2") int j) {
//		ModelAndView mv = new ModelAndView();
//		int k = i+j;
//		mv.addObject("sum", k);
//		mv.setViewName("result");
//		return mv;
//	}
	
// In this scenario both Model and Modelmap got same output, based on requirements we will use
	@RequestMapping("/add")
	public String add(@RequestParam("num1") int i, @RequestParam("num2") int j, Model m) {
		int k = i+j;
		m.addAttribute("sum", k);
		return "result";
	}
	
//	@RequestMapping("/addAlien")
//	public String add(@RequestParam("aid") int aid, @RequestParam("aName") String aName, Model m) {
//		Alien a = new Alien();
//		a.setAid(aid);
//		a.setaName(aName);
//		m.addAttribute("alienResult", a);
//		return "alienResult";
//	}
	
//	@RequestMapping("/addAlien")
//	@RequestMapping(value="/addAlien", method= RequestMethod.POST)
	@PostMapping(value="/addAlien")
	public String add(@ModelAttribute("alienResult") Alien a) {
		return "alienResult";
	}
	
//	@RequestMapping("/addAlien")
//	public String add(Alien a) {
//		return "alienResult";
//	}
	
	@ModelAttribute
	public void modelData(Model m) {
		m.addAttribute("name", "Telusko");
	}
	
//	@RequestMapping("/addAlien")
//	public String add(@ModelAttribute("alienResult") Alien a, Model m) {
//		m.addAttribute("name", "Telusko");
//		return "alienResult";
//	}
	
	@GetMapping(value="/getValues")
	public String getDatas(Model m) {
		List<Alien> list = Arrays.asList(new Alien(1,"a"),new Alien(11,"aa"));
		m.addAttribute("result", list);
		return "showData";
	}
}
