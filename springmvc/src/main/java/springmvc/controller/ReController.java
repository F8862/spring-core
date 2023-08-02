package springmvc.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class ReController {
	
	@RequestMapping("/one")
	//Redirect using redirect prefix
	/*public String one(){
		System.out.println("This is one handler");
		return "redirect:/enjoy";
		
	}*/
	//Redirect using RedirectView
	public RedirectView one(){
		System.out.println("This is one handler");
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl("enjoy");
		return redirectView;
		
	}
	
	//Redirect using HttpServletResponse(this is old one)
	/*public String one(HttpServletResponse response){
		System.out.println("This is one handler");
		try {
			response.sendRedirect("");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "";
		
	}*/
	
	@RequestMapping("/enjoy")
	public String two(){
		System.out.println("This is second handler");
		return "contact";
		
	}
}
