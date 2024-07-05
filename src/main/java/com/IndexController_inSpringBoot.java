package com;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController_inSpringBoot {
	
	@GetMapping("/")
	public String index(Model model) {
		return "seat"; // view
	}

}
