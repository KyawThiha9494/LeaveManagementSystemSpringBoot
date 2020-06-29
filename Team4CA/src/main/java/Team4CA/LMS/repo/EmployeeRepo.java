package Team4CA.LMS.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import Team4CA.LMS.domain.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}
