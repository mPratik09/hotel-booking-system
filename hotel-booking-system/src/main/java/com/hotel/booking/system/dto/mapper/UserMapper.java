package com.hotel.booking.system.dto.mapper;

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
		user.setPassword(userReqDto.getPassword());
		user.setReEnterPassword(userReqDto.getReEnterPassword());
		user.setContactNum(userReqDto.getContactNum());

		return user;
	}

	public static UserResponseDTO userDtoMapper(User user)
	{
		UserResponseDTO userDto = new UserResponseDTO(user.getId(), user.getFirstName(), user.getLastName(),
				user.getEmail(), user.getContactNum());
		return userDto;
	}

}
