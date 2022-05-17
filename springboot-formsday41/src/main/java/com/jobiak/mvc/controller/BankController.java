package com.jobiak.mvc.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jobiak.mvc.model.BankUser;
import com.jobiak.mvc.repository.BankRepository;

@Controller
public class BankController {
	
	
	@Autowired
	BankRepository repo;
	public BankController() {
		
	}
	public BankController(BankRepository repo) {
		this.repo=repo;
	}
	
	@RequestMapping(path="/test",method=RequestMethod.GET)
	public String redirect() {
		
		return "banksignup";
		
	}
	@RequestMapping(path="/banksignup",method=RequestMethod.POST)
	public String doSignUp(@ModelAttribute("bankuser")BankUser bankuser) {
		repo.save(bankuser);
		return "banksuccess";
	}


}