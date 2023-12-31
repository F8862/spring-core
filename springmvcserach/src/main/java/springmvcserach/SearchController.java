package springmvcserach;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController {
	
	@RequestMapping("/user/{userId}/{userName}")
	public String getUserDetail(@PathVariable("userId") int userId,@PathVariable("userName") String userName){
		System.out.println(userId);
		System.out.println(userName);
		Integer.parseInt(userName);//NumberFormatException has occured
		return "home";
	}

	@RequestMapping("/home")
	public String home(){
		System.out.println("Going to home view");
		String str=null;
		System.out.println(str.length());//NullPointerException has occured
		return "home";
	}
	
	@RequestMapping("/search")
	public RedirectView search(@RequestParam("querybox") String query){
		String url="https://www.google.com/search?q="+query;
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(url);
		return redirectView;
		
	}
	
	//handling exception in spring mvc
	/*@ExceptionHandler({NullPointerException.class,NumberFormatException.class})
	public String exceptionHandlerNull(){
		return "null_page";
		
	}*/
	/*@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)//we can send response code like this
	@ExceptionHandler(value=NullPointerException.class)
	public String exceptionHandlerNull(Model m){
		m.addAttribute("msg","NullPointerException has occured");
		return "null_page";
		
	}
	
	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)//we can send response code like this
	@ExceptionHandler(value=NumberFormatException.class)
	public String exceptionHandlerNumberFormat(Model m){
		m.addAttribute("msg","NumberFormatException has occured");
		return "null_page";
		
	}
	
	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)//we can send response code like this
	@ExceptionHandler(value=Exception.class)
	public String exceptionHandlerGeneric(Model m){
		m.addAttribute("msg","Exception has occured");
		return "null_page";
		
	}*/
	
	
}
