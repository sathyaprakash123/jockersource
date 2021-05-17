package com.jockerspring.jockersource.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JockerAPI {

	Logger logger = LoggerFactory.getLogger(JockerAPI.class);
	CallService callservice;
	private static final String BASE_URL = "http://official-joke-api.appspot.com/random_joke";

	@RequestMapping("/getjoke")
	public JokeClass getJoke() {

		logger.info("getjoke called");
		CallService callservice = new CallService();
		return callservice.getJokeCall();
}

}
