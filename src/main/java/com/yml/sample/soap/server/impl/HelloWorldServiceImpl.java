package com.yml.sample.soap.server.impl;


import javax.jws.WebService;

import com.yml.sample.soap.server.model.ApplicationCredentials;
import com.yml.sample.soap.server.service.HelloWorldService;

@WebService(endpointInterface = "com.yml.sample.soap.server.service.HelloWorldService")
public class HelloWorldServiceImpl implements HelloWorldService {

	@Override
	public String helloWorld(final String name,
			final ApplicationCredentials credential) {
		return "Hello World from " + name;
	}
}
