package com.hotel.booking.system.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController
{

	@GetMapping("/")
	public String home()
	{
		System.out.println("Entry Point");
		return "index";
	}

}
