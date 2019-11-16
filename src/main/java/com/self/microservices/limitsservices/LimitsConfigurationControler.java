package com.self.microservices.limitsservices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.self.microservices.limitsservices.bean.LimitsConfiguration;

@RestController
public class LimitsConfigurationControler {
	@Autowired
	private Configuration configuration;
	
	@GetMapping("/limits")
	public LimitsConfiguration retrieveLimitsFromConfiguration() {
		
		return new LimitsConfiguration(configuration.getMaximum(),configuration.getMinimum());
		
	}

}
