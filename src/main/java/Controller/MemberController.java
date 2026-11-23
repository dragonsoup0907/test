package Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import Service.MemberService;


@Controller
@RequestMapping("member")
public class MemberController {
	private final MemberService memberService;
	
	@Autowired
	public MemberController(MemberService memberService) {
		this.memberService = memberService;
	}
	
	// 회원가입
	
	// 로그인
	
	// 로그아웃
	
	// 사용자 변경
	
	// 사용자 확인
	
	// 권한 확인
	
	
}