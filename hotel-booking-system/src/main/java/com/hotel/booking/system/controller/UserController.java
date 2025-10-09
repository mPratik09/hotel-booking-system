package com.hotel.booking.system.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hotel.booking.system.entities.User;

@RestController
public class UserController
{

	private static Logger log = LoggerFactory.getLogger(UserController.class);

	@PostMapping("/saveUser")
	public void saveUser(@RequestBody User user)
	{
		log.info("Inside SaveUser:\t");
		log.info("User name:\t" + user.getFirstName());
		log.info("User Email:\t" + user.getEmail());
	}

}
