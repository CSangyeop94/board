package com.spring.board.service.impl;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import com.spring.board.dao.UserDAO;
import com.spring.board.dao.impl.UserDAOImpl;
import com.spring.board.model.User;
import com.spring.board.service.UserService;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{
	
	private final UserDAOImpl userDAO;
	
	// 회원 가입
	@Override
	@Transactional
	public void join(User user) {
		log.info("userServiceImpl.class");
		userDAO.join(user);	
	}

	// 로그인
	@Override
	public User loginUser(User user) {
		return userDAO.loginUser(user);
	}
	
	// 회원 탈퇴
	@Override
	public void deleteUser(Integer index) {
		userDAO.deleteUser(index);
	}
	
	// 회원 조회
	@Override
	public Optional<User> findById(Integer index) {
		return userDAO.findById(index);
	}
	
	// 회원 업데이트
	@Override

	public void updateUser(User user) {
		userDAO.updateUser(user);
		
	}
	// 비밀번호 찾기
	@Override
	public Optional<User> findPwUser(String id) {
		return userDAO.findPwUser(id);
	}

	@Override
	public void updateCertified(Integer index) {
		userDAO.updateCertified(index);
		
	}

	@Override
	public List<User> findAll() {
		return userDAO.findAll();
	}

	@Override
	public void changePw(String id) {
		userDAO.changePw(id);
	}

	@Override
	public int idCheck(String id) {
		return userDAO.idCheck(id);
	}

	@Override
	public int EmailCheck(String email) {
		return userDAO.EmailCheck(email);
	}

	
}
