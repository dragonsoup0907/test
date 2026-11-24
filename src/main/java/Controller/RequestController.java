package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/requests")
public class RequestController {
	// 관리자 권한 요청 
	@PostMapping("/authorization/{member_id}")
	public void requstAuthorization() {
		
	}
	
	// 히스토리 삭제 요청 
	@PostMapping("/history/{history_id}")
	public void requestHistory() {
		
	}
		
	// 내 요청 내역
	@GetMapping("/myList")
	public void getMyRequest() {
		
	}
	
	// 요청 목록 조회
	@GetMapping("/list")
	public void getRequestList() {
		
	}
	
	// 요청 상세 조회
	@GetMapping("/{request_id}")
	public void getRequestDetail() {
		
	}
	
	// 요청 승인/거절
	@PostMapping("/{requestId}/approve")
	public void requestHistoryApprove() {
		
	}
	
	// 요청 승인/거절
	@PostMapping("/{requestId}/reject")
	public void requestHistoryReject() {
		
	}
}	
