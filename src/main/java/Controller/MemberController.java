package Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import Service.MemberService;


@Controller
@RequestMapping("members")
public class MemberController {
	private final MemberService memberService;
	
	@Autowired
	public MemberController(MemberService memberService) {
		this.memberService = memberService;
	}
	
	// 회원가입
	@PostMapping("/register")
	public void register() {
		
	}
	
	// 로그인
	@PostMapping("/login")
	public void login() {
		
	}
	
	// 로그아웃
	@PostMapping("/logout")
	public void logout() {
		
	}
	
	// 계정잠금 해제
	@PostMapping("/unlock")
	public void unlock() {
		
	}
	
	// 내 정보 조회
	@GetMapping("/me")
	public void me() {
		
	}
	
	// 개인정보 수정
	@PatchMapping("members/me/{member_id}")
	public void changeMyInfo() {
		
	}
	
	// 비밀번호 수정
	@PatchMapping("members/password/{member_id}")
	public void changePwd() {
		
	}
}