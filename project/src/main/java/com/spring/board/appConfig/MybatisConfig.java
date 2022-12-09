package com.spring.board.appConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.spring.board.dao.UserDAO;
import com.spring.board.dao.impl.UserDAOImpl;
import com.spring.board.mybatis.UserMapper;
import com.spring.board.service.UserService;
import com.spring.board.service.impl.UserServiceImpl;

import lombok.RequiredArgsConstructor;

@Configuration
@RequiredArgsConstructor
public class MybatisConfig {
	
	private final UserMapper userMapper;
	
	@Bean
	public UserService userService() {
		return new UserServiceImpl(userDAO());
	}
	
	@Bean
	public UserDAOImpl userDAO() {
		return new UserDAOImpl(userMapper);
	}
}
