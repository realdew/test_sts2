package test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class FirstController {
	//@RequestMapping(value = "/home", method=RequestMethod.GET)
	@GetMapping("/home")
	@ResponseBody
	public String goHome(HttpServletRequest request) {
		System.out.println("enter");
		return "Hello Spring Boot!";
	}
}

