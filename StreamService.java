package com.xworkz.roadmap.service;

public interface StreamService {
	boolean validateAndSave(String streamName);
	boolean isExists(String streamName);

}
