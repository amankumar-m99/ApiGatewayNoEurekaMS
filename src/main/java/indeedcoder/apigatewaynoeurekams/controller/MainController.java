package indeedcoder.apigatewaynoeurekams.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service1")
public class MainController {

	@GetMapping("")
	public String getHome(@RequestHeader(name = "Authorization", required = false, defaultValue = "null") String auth) {
		return "Home page of service 1. Authorization =" + auth;
	}

	@GetMapping("/about")
	public String getAbout(@RequestHeader(name = "Authorization", required = false, defaultValue = "null") String auth) {
		return "About page of service 1. Authorization =" + auth;
	}
}
