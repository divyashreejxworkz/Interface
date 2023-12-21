package com.xworkz.roadmap.runner;

import com.xworkz.roadmap.repository.StreamRepository;
import com.xworkz.roadmap.repository.StreamRepositoryImplementation;
import com.xworkz.roadmap.service.StreamService;
import com.xworkz.roadmap.service.StreamServiceImplementation;

public class StreamRunner {
	public static void main(String[] args) {
		StreamRepository repository=new StreamRepositoryImplementation();
		StreamService service = new StreamServiceImplementation(repository);
		service.validateAndSave("IS");
		service.validateAndSave("CS");
	}
}
