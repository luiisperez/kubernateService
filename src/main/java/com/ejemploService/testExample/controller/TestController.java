package com.ejemploService.testExample.controller;

import com.ejemploService.testExample.model.TestModel;

public class TestController {
	
	private TestModel testing = new TestModel();
	public String getStringController() 
	{
		return testing.getString();
	}
	
	public String getStringSpecialController(String name) 
	{
		return testing.getStringSpecial(name);
	}

}
