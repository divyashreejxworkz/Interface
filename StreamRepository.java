package com.xworkz.roadmap.repository;

public interface StreamRepository {
	boolean onSave(String streamName);
	String[] read();

}
