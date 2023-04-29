package com.xgieit.aws.demo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class AwsController {
	
	@GetMapping("/")
	public String message()
	{
		return "welcome to xgileit...";
	}

}
