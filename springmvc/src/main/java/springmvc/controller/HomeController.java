package springmvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/first")
public class HomeController {
	
	@RequestMapping(path="/home",method=RequestMethod.GET)//like this we can specify method (get,post,put,delete etc)
	/*sending data from controller to view dynamically using model object*/
	public String home(Model model){
		System.out.println("This is home url");
		model.addAttribute("name","Furquan Ansari");
		model.addAttribute("id",444);
		List<String> friends=new ArrayList<String>();
		friends.add("Salim");
		friends.add("Faizan");
		
		model.addAttribute("f",friends);

		return "index";
	}
	
	@RequestMapping("/about")
	public String about(){
		System.out.println("This is about url");
		return "about";
	}
	
	@RequestMapping("/help")
	/*sending data from controller to view dynamically using ModelAndView object*/
	public ModelAndView help(){
		System.out.println("This is help controller");
		//creating modelAndView object
		ModelAndView modelAndView=new ModelAndView();
		//setting data
		modelAndView.addObject("name","Izhan");
		modelAndView.addObject("rollNumber", 1234);
		LocalDateTime now = LocalDateTime.now();
		modelAndView.addObject("time",now);
		
		List<Integer> list=new ArrayList<Integer>();
		list.add(80);
		list.add(90);
		list.add(100);
		
		modelAndView.addObject("marks",list);
		
		
		//setting view name
		modelAndView.setViewName("help");
		return modelAndView;
	}
	

}
