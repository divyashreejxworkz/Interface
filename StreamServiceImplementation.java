package com.xworkz.roadmap.service;

import com.xworkz.roadmap.repository.StreamRepository;

public class StreamServiceImplementation implements StreamService {
	//this is assosiation as-a is-a
	private StreamRepository repository;
	//this is constructor for intializing varable
	public StreamServiceImplementation(StreamRepository repository) {
		this.repository=repository;
	}
	

	@Override
	public boolean validateAndSave(String streamName) {
		//whether data is valid or not
		//why we need to check empty bcoz space also character in java
		if(streamName.isEmpty()||streamName.isBlank()||
				streamName.length()<3 && streamName.length()>25||streamName==null)
		{
			System.out.println("Give the correct name");
			}else {
				//duplicate name checking
				boolean exist = isExists(streamName);
				if(exist!=true) {
					//invoke the onsave method
					boolean save=repository.onSave(streamName);
					//if(save==true)this type also ok
					if(save) 
					{
						System.out.println("added stream successfully");
						return true;
						}else {
							System.out.println("not added stream successfully");
							return false;
						}
					}
				return false;
			}
		
		return false;
	}

	@Override
	//here we are any duplicate values are not
	//it is not a built in method this is normal method and no need to save the data
	public boolean isExists(String streamName) {
	String[] stream=repository.read();
	//stream element and array name same idiya it will check
	if(stream !=null && streamName != null) {
		for(String name:stream) {
			if(name!=null) {
				if(name.equals(streamName)) {
					return true;
				}
			}
		}
	}
		return false;
	}

}
