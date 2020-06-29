package Team4CA.LMS.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Team4CA.LMS.domain.Overtime;
import Team4CA.LMS.domain.OvertimeStatus;
import Team4CA.LMS.repo.OvertimeRepo;

@Service
public class OvertimeServiceImpl implements OvertimeService {

	@Autowired
	OvertimeRepo overtimeRepo;

	@Override
	public boolean approvedOvertimeByManager(Integer id) {

		Overtime overtime = overtimeRepo.findById(id).get();
		overtime.setOvertimeStatus(OvertimeStatus.APPROVED);
		if (overtimeRepo.save(overtime) != null)
			return true;
		else
			return false;
	}

	@Override
	public boolean rejectedOvertimeByManager(Integer id) {
		Overtime overtime = overtimeRepo.findById(id).get();
		overtime.setOvertimeStatus(OvertimeStatus.REJECTED);
		if (overtimeRepo.save(overtime) != null)
			return true;
		else
			return false;
	}
	
	


}
