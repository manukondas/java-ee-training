package abhinav.spring.rest.controller;

import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	
	final AtomicInteger atomicInteger = new AtomicInteger();

	@GetMapping("/welcome")
	public User welcome(@RequestParam( name="user", defaultValue = "Guy" ) String name) {
		
		User user = new User(atomicInteger.incrementAndGet(), name);
		return user;
	}
	
	
	@PostMapping("/updateUser")
	public User welcome(@RequestBody User user) {
		
		System.out.println(user.getId());
		System.out.println(user.getName());
		return user;
	}
}
