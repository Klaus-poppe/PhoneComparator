package com.mdp.app.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mdp.app.entity.Phone;
import com.mdp.app.service.PhoneService;

@RestController
@RequestMapping(value="/")
@CrossOrigin(origins = "*")
public class PhoneController {
	
	@Autowired
	private PhoneService phoneService;
	
	@GetMapping("/hello")	
	public String hello() {
		return "Hello world";
	}
	
	@GetMapping("/all")	
	public Iterable<Phone> allPhones() {
		return phoneService.getAllPhones();
	}
	
	@PostMapping("/insert")
	public Phone insertPhone(@RequestBody Phone phone) {
		return phoneService.insertPhone(phone);
	}
	
	@GetMapping("/get/{phoneName}")
	public Phone getPhoneByName(@PathVariable("phoneName") String phoneName) {
		return phoneService.getPhoneByName(phoneName);
	}
}
