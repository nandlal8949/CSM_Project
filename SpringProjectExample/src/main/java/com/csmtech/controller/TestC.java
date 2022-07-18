package com.csmtech.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.csmtech.service.CountriesService;

@Controller
public class TestC {

	@Autowired
	private CountriesService countriesService;
	
	@RequestMapping(path = "/test")
	public String jspWork(Model model,HttpServletRequest req) { 
		model.addAttribute("countryList",countriesService.getAllCountries());
		req.setAttribute("name","Countries");
		return "test";
	}
}
