package springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.model.User;
import springmvc.service.UserService;

@Controller
public class ContactController {
	
	@Autowired
	private UserService userService;
	@ModelAttribute//we use @ModelAttribute at top of method for showing commomn content in each method of this class
	public void commonDataForModel(Model m){
		m.addAttribute("Header","Learn With Furquan Ansari");
		m.addAttribute("Desc","Home For Programmer");
		
	}
	
	@RequestMapping("/contact")
	public String showForm(Model m){
		/*m.addAttribute("Header","Learn With Furquan Ansari");
		m.addAttribute("Desc","Home For Programmer");*/
		return "contact";
		
	}
	
	//Get gata using @ModelAttribute
			@RequestMapping(path="/processform",method=RequestMethod.POST)
			public String handleForm(@ModelAttribute("user") User user,Model model){
				
				/*model.addAttribute("Header","Learn With Furquan Ansari");
				model.addAttribute("Desc","Home For Programmer");*/
				
				if(user.getUserName().isEmpty()){
					return "redirect:/contact";
				}
				System.out.println(user);
				int createdUser = this.userService.createUser(user);//save user into db
				model.addAttribute("msg","User created with id " + createdUser);
				
				return "success";
				
			}
	
	/*//Get gata using @RequestParam
	@RequestMapping(path="/processform",method=RequestMethod.POST)
	public String handleForm(@RequestParam(name="email",required=true) String userEmail,
			                 @RequestParam("userName") String userName,
			                 @RequestParam("password") String userPassword,
			                 Model model){
		
		System.out.println("user email " + userEmail);
		System.out.println("user Name " + userName);
		System.out.println("user password " + userPassword);
		User user=new User();
		user.setEmail(userEmail);
		user.setUserName(userName);
		user.setPassword(userPassword);
		
		System.out.println(user);
		
		model.addAttribute("name",userName);
		model.addAttribute("email",userEmail);
		model.addAttribute("password",userPassword);
		
		model.addAttribute("user",user);
		
		return "success";
		
	}
*/
	
	
}
