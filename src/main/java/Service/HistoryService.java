package Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestParam;

import DTO.HistoryDTO;
import Repository.HistoryRespository;

public class HistoryService {
	private HistoryRespository historyRepository;
	
	@Autowired
	public HistoryService(HistoryRespository historyRepository) {
		this.historyRepository = historyRepository;
	}
	
	// 검색 + 리스트조회 (페이지네이션)
	public List<HistoryDTO> getHistoryList(@RequestParam String id) {
		return null;
	}
	
	// 상세조회
	public List<HistoryDTO> getHistoryList(@RequestParam String id) {
		return null;
	}
	
	// 수정
	
	// 삭제
}
