package com.hotel.booking.system.service;

import java.sql.PreparedStatement;
import java.sql.Statement;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Service;

import com.hotel.booking.system.dto.mapper.UserMapper;
import com.hotel.booking.system.entities.User;
import com.hotel.booking.system.request.dto.UserRequestDTO;
import com.hotel.booking.system.response.dto.UserResponseDTO;

@Service
public class UserService
{

	private static final Logger log = LoggerFactory.getLogger(UserService.class);

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Value("${PERSIST_USER}")
	private String persist_user;

	@Value("${FETCH_USER}")
	private String fetch_user;

	public UserResponseDTO saveUser(UserRequestDTO userRequestDto)
	{
		User user = UserMapper.userMapper(userRequestDto);

		KeyHolder keyHolder = new GeneratedKeyHolder();

		jdbcTemplate.update(connection ->
		{
			PreparedStatement ps = connection.prepareStatement(persist_user, Statement.RETURN_GENERATED_KEYS);
			ps.setString(1, user.getFirstName());
			ps.setString(2, user.getLastName());
			ps.setString(3, user.getEmail());
			ps.setString(4, user.getPassword());
			ps.setString(5, user.getContactNum());
			return ps;
		}, keyHolder);

//		sets generated id into user ONJECT from database
		Integer userId = keyHolder.getKey().intValue();
		user.setId(userId);

//		fetches row from database by id 
		User savedUser = jdbcTemplate.queryForObject(fetch_user, new BeanPropertyRowMapper<>(User.class), userId);

		return UserMapper.userDtoMapper(savedUser);
	}

}
