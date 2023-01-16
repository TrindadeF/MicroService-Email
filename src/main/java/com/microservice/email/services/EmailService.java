package com.microservice.email.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservice.email.entities.EmailModel;
import com.microservice.email.repositories.EmailRepository;

@Service
public class EmailService {

	@Autowired
	EmailRepository emailRepository;

	public void sendEmail(EmailModel emailModel) {
		// TODO Auto-generated method stub
		
	}
}
