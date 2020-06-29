package Team4CA.LMS.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import Team4CA.LMS.repo.LeaveRequestRepo;


@Controller
public class LeaveRequestController {

	@Autowired
	LeaveRequestRepo leaveRepo;
	
	@RequestMapping(value = "/leavelist")
	public String list(Model model) {
		model.addAttribute("list",leaveRepo.findAll());
		return "ManagerLeaveToApproveList";
	}
}
