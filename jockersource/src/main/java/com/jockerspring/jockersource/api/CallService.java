package com.jockerspring.jockersource.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CallService {

	Logger logger = LoggerFactory.getLogger(CallService.class);
	private static final String BASE_URL = "http://official-joke-api.appspot.com/random_joke";
	

	public JokeClass getJokeCall()

	{  
		logger.info("Entered Response Entity Method");
		RestTemplate restTemplate = new RestTemplate();
		JokeClass responseEntity = restTemplate.getForObject(BASE_URL, JokeClass.class);
		return responseEntity;
	}

}
