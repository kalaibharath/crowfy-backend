package com.crowfy.v1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CrowfyController {

	@GetMapping(value = "/healthCheck")
	public String healthCheck() {

		return "Good";
	}

}
