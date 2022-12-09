package com.spring.board.mybatis;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

import org.apache.ibatis.annotations.Mapper;

import com.spring.board.model.User;

@Mapper
public interface UserMapper {

	// 회원 가입
	void join(User user);

	// 회원 수정
	void updateUser(User user);

	// 회원 이메일 인증
	void updateCertified(Integer index);

	// 회원 조회(마이페이지용)
	Optional<User> findById(Integer index);

	// 회원 전체 리스트
	List<User> findAll();

	// 회원 탈퇴(잠시 계정 정지시키고 정지 기간이 늘어나면 삭제)
	void deleteUser(Integer index);

	// 회원 이메일 인증
	Optional<User> findPwUser(String id);

	void changePw(String id);

	// 아아디 중복 검사
	int idCheck(String id);

	// 아아디 중복 검사
	int EmailCheck(String email);

	// 로그인
	User loginUser(User user);
	/*
	 * // 회원 탈퇴 여부 조회 Optional<Date> isQuitUser();
	 */

}
