package com.springboot.training_portal.Controller;

 
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.RestController;

	@RestController
	public class PortalController {

	    @GetMapping("/home")
	    public String home() {
	        return "Welcome to my portal";
	    }

	    @GetMapping("/student/dashboard")
	    public String studentDashBoard() {
	        return "Welcome student";
	    }

	    @GetMapping("/admin/dashboard")
	    public String adminDashBoard() {
	        return "This is Admin page";
	    }
	}

