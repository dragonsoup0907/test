package Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "members")
@Getter
@NoArgsConstructor
public class Member {
	@Id
	private Long id;
	private String pwd;
	private String name;
	private String email;
	private String role;
	private Boolean isAdmin;
	
	@Builder
	public Member(Long id, String pwd, String name, String email, String role, Boolean isAdmin) {
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.email = email;
		this.role = role;
		this.isAdmin = isAdmin;
	}
}