package Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "task_histories")
@Getter
@NoArgsConstructor
public class TaskHistory {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Long taskId;
	private Long member_Id;
	private String action;
	private String field;
	private String beforeValue;
	
	@Builder
	public TaskHistory(Long taskId, Long member_Id, String action, String field, String beforeValue) {
		this.taskId = taskId;
		this.member_Id = member_Id;
		this.action = action;
		this.field = field;
		this.beforeValue = beforeValue;
	}
}
