package study.datajap.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import study.datajap.entity.Member;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
