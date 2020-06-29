package Team4CA.LMS.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import Team4CA.LMS.domain.Employee;


@Controller
public class EmployeeController {

	@RequestMapping(value = "employee/add")
	public String add(Model model) {
		model.addAttribute("employee", new Employee());
		return "employeeAdd";
	}
}
