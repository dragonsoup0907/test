package Entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tasks")
@Getter
@NoArgsConstructor
public class Task {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Integer writerId;
	private String titel;
	private String content;
	private String importance;
	private String status;
	private Integer progress;
	private Date dueDate;
	private Date createdAt;
	
	@Builder
	public Task(Integer writerId, String titel, String content, String importance, String status,
			Integer progress, Date dueDate, Date createdAt) {
		this.writerId = writerId;
		this.titel = titel;
		this.content = content;
		this.importance = importance;
		this.status = status;
		this.progress = progress;
		this.dueDate = dueDate;
		this.createdAt = createdAt;
	}
}
