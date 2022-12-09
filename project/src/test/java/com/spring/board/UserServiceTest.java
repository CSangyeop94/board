package com.spring.board;


import org.assertj.core.api.Assertions;
import org.hamcrest.core.IsInstanceOf;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.spring.board.dao.impl.UserDAOImpl;
import com.spring.board.model.User;
import com.spring.board.service.impl.UserServiceImpl;

import lombok.extern.slf4j.Slf4j;
import java.sql.Date;
@Slf4j
@SpringBootTest
public class UserServiceTest {

	@Autowired
	private UserDAOImpl userService;
	

	@Test
	public void join() {
		Date date = new Date(0);
		
		log.info("회원가입 테스트");
		User user = new User();
		user.setIndex(1);
		user.setId("아이디1");
		user.setDate(date);
		user.setNickName("안녕하세요");
		user.setPw("1234");
		user.setEmail("gatsss@ssss.com");
	
		log.info("user={}", user);
		  
		 Assertions.assertThatThrownBy(() -> userService.join(user))
		 .isInstanceOf(NullPointerException.class);
		 
		
	}
	
}
