package com.mdp.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.mdp.app.entity.Phone;


public interface PhoneDAO  extends JpaRepository<Phone, Integer> {
	public Phone findByName(@Param("name") String name);
}



