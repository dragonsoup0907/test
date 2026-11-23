package Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import DTO.HistoryDTO;
import DTO.ResponseDTO;
import Service.HistoryService;

@Controller
@RequestMapping("/history")
public class HisotryController {
	private final HistoryService historyService;
	
	@Autowired
	public HisotryController(HistoryService historyService) {
		this.historyService = historyService;
	}
	
	// 검색 + 리스트조회 (페이지네이션)
	@GetMapping("/list")
	public ResponseDTO<HistoryDTO> historyList(@RequestParam String id) {
		return null;
	}
	
	
	// 상세조회
	@GetMapping("/detail")
	public ResponseDTO<HistoryDTO> historyDetail() {
		return null;
	}
	
	// 수정
	@PostMapping("/update")
	public ResponseDTO<HistoryDTO> historyUpdate(@RequestBody HistoryDTO historyDTO) {
		return null;
	}
	
	// 삭제
	@PostMapping("/delete")
	public ResponseDTO<HistoryDTO> historyDelte(@RequestBody HistoryDTO historyDTO) {
		return null;
	}	
}
