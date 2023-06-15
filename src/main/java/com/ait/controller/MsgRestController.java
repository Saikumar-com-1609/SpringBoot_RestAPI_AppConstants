package com.ait.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgRestController {

	/**
	 * @Value annotation is used for read the values from properties file based on
	 *        the key
	 * 
	 *  This is used for maximum 5 values only but if 100 keys are
	 *  available in properties file then u can't write this @Value for 100
	 *  times(that is become duplication) so this is not recommended in
	 *  realtime environment
	 */

	@Value("${welcomeMsg}")
	private String wmg;

	@Value("${greetMsg}")
	private String gmsg;

	@GetMapping("/welcome")
	public String welcomePage() {

		return wmg;
	}

	@GetMapping("/greet")
	public String greetMessage() {
		return gmsg;
	}

}
