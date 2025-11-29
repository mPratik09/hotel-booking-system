package com.hotel.booking.system.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hotel.booking.system.request.dto.UserRequestDTO;
import com.hotel.booking.system.response.dto.UserResponseDTO;
import com.hotel.booking.system.service.UserService;

@RestController
public class UserController
{

	@Autowired
	private UserService userService;

	@Value("${PERSIST_USER}")
	private String persist_user;

	private static Logger log = LoggerFactory.getLogger(UserController.class);

	@CrossOrigin(origins = "http://localhost:3000")
	@GetMapping("/saveUser")
	public void saveUser()
	{
		System.out.println("Hello WOrld");
	}

	@CrossOrigin(origins = "http://localhost:3000")
	@PostMapping("/saveUser")
	public ResponseEntity<UserResponseDTO> saveUser(@RequestBody UserRequestDTO userRequestDto)
	{

		UserResponseDTO userResponseDTO = userService.saveUser(userRequestDto);

		return ResponseEntity.status(HttpStatus.CREATED).body(userResponseDTO);

	}

}
