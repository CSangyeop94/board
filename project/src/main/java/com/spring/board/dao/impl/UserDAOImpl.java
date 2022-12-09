package com.spring.board.dao.impl;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.spring.board.dao.UserDAO;
import com.spring.board.model.User;
import com.spring.board.mybatis.UserMapper;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Repository
@RequiredArgsConstructor
public class UserDAOImpl implements UserDAO {

	private final UserMapper userMapper;

	@Override
	public void join(User user) {
		log.info("userDaoImpl.class");
		userMapper.join(user);
	}

	@Override
	public void updateUser(User user) {
		userMapper.updateUser(user);
	}

	@Override
	public void updateCertified(Integer index) {
		userMapper.updateCertified(index);
	}

	@Override
	public Optional<User> findById(Integer index) {
		return userMapper.findById(index);
	}

	@Override
	public List<User> findAll() {
		return userMapper.findAll();
	}

	@Override
	public void deleteUser(Integer index) {
		userMapper.deleteUser(index);
	}

	@Override
	public Optional<User> findPwUser(String id) {
		return userMapper.findPwUser(id);
	}

	@Override
	public void changePw(String id) {
		userMapper.changePw(id);
	}

	@Override
	public int idCheck(String id) {
		return userMapper.idCheck(id);
	}

	@Override
	public int EmailCheck(String email) {
		return userMapper.EmailCheck(email);
	}

	@Override
	public User loginUser(User user) {
		return userMapper.loginUser(user);
	}

	/*
	 * @Override public void isQuitUser() { userMapper.isQuitUser(); }
	 */
}
