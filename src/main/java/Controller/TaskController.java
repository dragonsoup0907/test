package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/tasks")
public class TaskController {
	// 업무 목록 조회
	@GetMapping("/list")
	public void getTaskList() {
		
	}
	
	// 업무 상세 조회
	@GetMapping("/detail")
	public void getTaskDetail() {
		
	}
	
	// 업무 등록
	@PostMapping("/register")
	public void registerTask() {
		
	}
	
	// 업무 수정
	@PatchMapping("/{taskId}")
	public void updateTask() {
		
	}
	
	@DeleteMapping("/{taskId}")
	public void deleteTask() {
		
	}

}
