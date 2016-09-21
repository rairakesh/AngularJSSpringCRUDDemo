package com.siyon.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SiyonRESTController {

	private static final Logger LOGGER = LoggerFactory.getLogger(SiyonRESTController.class);
	private final String URL = "http://localhost:8081"; // Change it for localhost or stage

	/*
	 * SiyonRESTController 
	 * Test Spring Boot application.
	 */
	@CrossOrigin(origins = URL)
	@RequestMapping("/siyonGreeting")
    public String index() {
		LOGGER.info("Testing the controller");
        return "Greetings from Siyon!";
    }
}
