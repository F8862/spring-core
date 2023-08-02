package springmvcserach;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice//it will specify that this class will handle all exception coming in project
public class MyExceptionHandler {
	
	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)//we can send response code like this
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
		
	}

}
