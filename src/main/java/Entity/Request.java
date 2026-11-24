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
@Table(name = "requests")
@Getter
@NoArgsConstructor
public class Request {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Long member_id;
	private String type;
	private Long historyId;
	private String reason;
	private String status;	
	
	@Builder
	public Request(Long member_id, String type, Long historyId, String reason, String status) {
		this.member_id = member_id;
		this.type = type;
		this.historyId = historyId;
		this.reason = reason;
		this.status = status;
	}
}
