package Team4CA.LMS.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

	
	@RequestMapping("/manager")
	public String manager(Model model) {
		return "ManagerWelcomePage";
	}
}
