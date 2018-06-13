package com.ejemploService.testExample.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ejemploService.testExample.controller.TestController;

@RestController
public class TestService {
	
	
	private TestController testing = new TestController();
	
	@RequestMapping(value = "/getHolaMundo", method = RequestMethod.GET)
	public String getHolaMundo() 
	{
		return testing.getStringController();
	}
	
	@RequestMapping(value = "/getHolaSpecial", method = RequestMethod.GET)
	public String getHolaMundoSpecial(@RequestParam(value = "name") String name) 
	{
		return testing.getStringSpecialController(name);
	}
}
