package com.mdp.app.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.mdp.app.dao.PhoneDAO;
import com.mdp.app.entity.Phone;

@Service
public class PhoneService {
	
	@Autowired
	private PhoneDAO phoneDAO;
	
	public Iterable<Phone> getAllPhones() {
		return phoneDAO.findAll();
	}
	
	public Phone insertPhone(Phone phone) {
		return phoneDAO.save(phone);
	}
	
	public Phone getPhoneByName(String phoneName) {
		return phoneDAO.findByName(phoneName);
	}
}
