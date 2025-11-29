package com.hotel.booking.system.dto.mapper;

import org.springframework.security.crypto.factory.PasswordEncoderFactories;

import com.hotel.booking.system.entities.User;
import com.hotel.booking.system.request.dto.UserRequestDTO;
import com.hotel.booking.system.response.dto.UserResponseDTO;

public class UserMapper
{

	public static User userMapper(UserRequestDTO userReqDto)
	{
		User user = new User();

		user.setFirstName(userReqDto.getFirstName());
		user.setLastName(userReqDto.getLastName());
		user.setEmail(userReqDto.getEmail());
//		user.setPassword(userReqDto.getPassword());

//		By using:
//		Spring’s wrapper around BCrypt
//		BCrypt + Spring integration + extra features
		if (checkPassword(userReqDto.getPassword(), userReqDto.getReEnterPassword()))
		{
			user.setPassword(
					PasswordEncoderFactories.createDelegatingPasswordEncoder().encode(userReqDto.getPassword()));
		} else
		{
			throw new IllegalArgumentException("Passwords did not match");
		}

//		By using: 
//		BCrypt (jBCrypt library)	-	low-level hashing 
//		user.setPassword(BCrypt.hashpw(userReqDto.getPassword(), BCrypt.gensalt()));

		user.setContactNum(userReqDto.getContactNum());

		return user;
	}

	private static boolean checkPassword(String password, String reEnterPassword)
	{
		return password.equals(reEnterPassword);
	}

	public static UserResponseDTO userDtoMapper(User user)
	{
		UserResponseDTO userDto = new UserResponseDTO(user.getId(), user.getFirstName(), user.getLastName(),
				user.getEmail(), user.getContactNum());
		return userDto;
	}

}
