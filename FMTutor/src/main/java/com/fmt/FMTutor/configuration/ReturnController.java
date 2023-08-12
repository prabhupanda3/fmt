package com.fmt.FMTutor.configuration;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class ReturnController {
@GetMapping("/hi")	
public String getMessage() {
	System.out.print("Hi Pravanjan Good evening");
	return "Hi Pravanjan";
}
}
