package com.yml.sample.soap.server.service;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import com.yml.sample.soap.server.model.ApplicationCredentials;
@WebService
public interface HelloWorldService {

	@WebMethod(operationName = "helloWorld", action = "http://localhost:8080/hello-world/helloWorld")
	String helloWorld(final String name,
			@WebParam(header = true) final ApplicationCredentials credential);

}
