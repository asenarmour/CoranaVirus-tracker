package io.javabrains.coronavirustracker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import io.javabrains.coronavirustracker.services.CoronavirusDataService;

@Controller
public class HomeController {

	@Autowired
	CoronavirusDataService coronavirusDataService;
	@GetMapping("/")
	public String home(Model model) {
		model.addAttribute("locationStats",coronavirusDataService.getAllStats());
		return "home";
	}
}
