package com.pr.demoPR.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

import com.pr.demoPR.model.Persona;
import com.pr.demoPR.service.ExampleService;

@Service("exampleService")
public class ExampleServiceImpl implements ExampleService {

	private static final Log LOG = LogFactory.getLog(ExampleServiceImpl.class);
	
	@Override
	public List<Persona> getListPersona() {
		List<Persona> people= new ArrayList<>();
		people.add(new Persona("Jon", 23));
		people.add(new Persona("Mikel", 21));
		people.add(new Persona("diego", 43));
		people.add(new Persona("Juan", 19));
		LOG.info("Hello from Service");
		return people;
	}

}
