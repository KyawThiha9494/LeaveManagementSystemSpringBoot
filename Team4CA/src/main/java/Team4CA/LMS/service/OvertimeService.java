package Team4CA.LMS.service;

import Team4CA.LMS.domain.Overtime;

public interface OvertimeService {

	public boolean approvedOvertimeByManager(Integer id);
	
	public boolean rejectedOvertimeByManager(Integer id);
}
