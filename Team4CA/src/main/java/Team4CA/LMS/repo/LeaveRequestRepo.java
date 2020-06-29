package Team4CA.LMS.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import Team4CA.LMS.domain.LeaveRequest;

public interface LeaveRequestRepo extends JpaRepository<LeaveRequest, Integer> {

}
