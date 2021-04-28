package org.academiadecodigo.asynctomatics.hackathonproject.controller.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class MainController {

	@RequestMapping(method = RequestMethod.GET, path = {"/", ""})
	public String addCustomer(Model model) {
		return "home";
	}
}

