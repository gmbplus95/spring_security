package com.ifi.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	@RequestMapping("/all")
	public String hello() {
		return "Unsecured page";
	}

	@RequestMapping("/secured")
	public String hello2() {
		return "Secured page";
	}
}
