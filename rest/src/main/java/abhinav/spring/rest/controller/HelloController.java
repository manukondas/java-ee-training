package abhinav.spring.rest.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	String helloTemplate = "Hello Mr. %s";
	
	@Value("${spring.datasource.url}")
	String dbUrl;
	@GetMapping("/hello")
	public String hello(@RequestParam String name) {
		
		System.out.println(dbUrl);
		
		return String.format(helloTemplate, name);
		
	}
	
	@GetMapping("/hello/{name}")
	public String sayHello(@PathVariable("name") String name) {
		
		return String.format(helloTemplate, name);
		
	}

}
