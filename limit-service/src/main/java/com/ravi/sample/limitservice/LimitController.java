package com.ravi.sample.limitservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitController {
	
	@Autowired
	private Configuration configuration;
	
	@GetMapping("/limits")
	public Limit getLimit()
	{
		return new Limit(configuration.getMinimum(),configuration.getMaximum());
	}

}
