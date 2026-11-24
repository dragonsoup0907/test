package Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Entity.Member;

public interface MemberRepository extends JpaRepository<Member, Long> {
	
}
