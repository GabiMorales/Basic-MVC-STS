package com.pr.demoPR.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/say")
public class HelloworldController {

	@GetMapping("/helloworld")
	public String helloworld() {
		return "helloworld";
	}
}
