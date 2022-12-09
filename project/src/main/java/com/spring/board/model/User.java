package com.spring.board.model;

import java.sql.Date;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

// 회원 
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {

	// 회원 번호
	private Integer index;
	// 회원 아이디
	@NotBlank(message = "Please Write id!")
	@Pattern(regexp = "^[a-zA-Z0-9]*$ ")
	private String id;
	
	// 닉네임
	@NotBlank(message = "욕은쓰지 말아주세요")
	@Pattern(regexp = "^[a-zA-Z0-9가-힣]*$ ")
	private String nickName;
	
	// 비밀번호 최소 8자, 대문자 하나 이상, 소문자 하나 및 숫자 하나
	@NotBlank(message = "Please Write Password!!")
	@Pattern(regexp="^(?=.*[A-Za-z])(?=.*\\d)(?=.*[$@$!%*#?&])[A-Za-z\\d$@$!%*#?&]{8,}$")
	private String pw;

	// 가입일
	private Date date;
	// 이메일
	@Pattern(regexp = "\\\\w+@\\\\w+\\\\.\\\\w+(\\\\.\\\\w+)?")
	private String email;
	// 생년월일
	private Date birthday;
	// 휴대전화
	@Pattern(regexp = "^010-\\d{4}-\\d{4}$")
	private String mobile;
	// 우편번호
	@Pattern(regexp = "^\\d{5}$")
	private String zip;
	// 주소
	private String address;
	// 상세주소
	private String addressDetail;
	// 레벨
	private Integer level;
	// 포인트
	private Integer point;
	// 상태정보
	private Integer state;
	// 탈퇴날짜
	private Date quitDate;
	
}
