package springmvcserach;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormController {
	
	@RequestMapping("/complex")
	public String showForm(){
		return "complex_form";
	}
	
	@RequestMapping(path="/handleform",method=RequestMethod.POST)
	//get data using @RequestParam
	/*public String formHandler(@RequestParam("name") String name,@RequestParam("id") Long id){
		System.out.println(name);
		System.out.println(id);*/
	//get data using @ModelAttribute
	public String formHandler(@ModelAttribute("student") Student student,BindingResult result){
		//BindingResult is use to handle error
		if(result.hasErrors()){
			return "complex_form"; 
		}
		System.out.println(student);
		System.out.println(student.getAddress());
		return "success";
		
		
	}

}
