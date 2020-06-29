package Team4CA.LMS.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import Team4CA.LMS.domain.User;

public interface UserRepo extends JpaRepository<User, Integer> {

}
