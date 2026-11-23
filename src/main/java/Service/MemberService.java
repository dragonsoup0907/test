package Service;

import org.springframework.beans.factory.annotation.Autowired;

import Repository.MemberRepository;

public class MemberService {
	private MemberRepository memberRepository;
	
	@Autowired
	public MemberService(MemberRepository memberRepository) {
		this.memberRepository = memberRepository;
	}
	
	// 회원가입
	
	// 로그인
	
	// 로그아웃
	
	// 사용자 변경
	
	// 사용자 확인
	
	// 권한 확인
}
