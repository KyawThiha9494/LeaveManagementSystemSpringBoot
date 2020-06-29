package Team4CA.LMS.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import Team4CA.LMS.domain.Overtime;

public interface OvertimeRepo extends JpaRepository<Overtime, Integer> {

}
