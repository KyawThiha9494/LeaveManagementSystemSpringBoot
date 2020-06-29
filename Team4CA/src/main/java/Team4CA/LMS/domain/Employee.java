package Team4CA.LMS.domain;

import java.util.Collection;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@NotBlank
	@Length(min = 3, max = 30)
	private String name;
	@NotBlank
	private Role role;
	private Gender gender;
	
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd-mm-yyyy")
	private Date dateOfBirth;
	
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd-mm-yyyy")
	private Date startDate;
	
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd-mm-yyyy")
	private Date endDate;
	
	@OneToOne
	@JoinColumn(name ="user_Id")
	User user;
	@OneToMany (mappedBy = "employee")
	private Collection<LeaveRequest> leaveRequest;

	public Employee() {
		super();
		
	}

	public Employee(@NotBlank @Length(min = 3, max = 30) String name, @NotBlank Role role, Gender gender,
			Date dateOfBirth, Date startDate, Date endDate, User user, Collection<LeaveRequest> leaveRequest) {
		super();
		this.name = name;
		this.role = role;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.startDate = startDate;
		this.endDate = endDate;
		this.user = user;
		this.leaveRequest = leaveRequest;
	}

	public Employee(@NotBlank @Length(min = 3, max = 30) String name, @NotBlank Role role, Gender gender,
			Date dateOfBirth, Date startDate, Date endDate) {
		super();
		this.name = name;
		this.role = role;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public Employee(@NotBlank @Length(min = 3, max = 30) String name, @NotBlank Role role, Gender gender,
			Date dateOfBirth, Date startDate, Date endDate, Collection<LeaveRequest> leaveRequest) {
		super();
		this.name = name;
		this.role = role;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.startDate = startDate;
		this.endDate = endDate;
		this.leaveRequest = leaveRequest;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Collection<LeaveRequest> getLeaveRequest() {
		return leaveRequest;
	}

	public void setLeaveRequest(Collection<LeaveRequest> leaveRequest) {
		this.leaveRequest = leaveRequest;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", role=" + role + ", gender=" + gender + ", dateOfBirth="
				+ dateOfBirth + ", startDate=" + startDate + ", endDate=" + endDate + ", user=" + user
				+ ", leaveRequest=" + leaveRequest + "]";
	}
	

	
	
	
	
	
	
	
	
	 
	
}
