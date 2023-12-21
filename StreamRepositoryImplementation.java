package com.xworkz.roadmap.repository;

public class StreamRepositoryImplementation implements StreamRepository{
private String[] stream = new String[3];
private int index=0;


	@Override
	public boolean onSave(String streamName) {
		//we have to store any element in array that time we have to check whether this array null or not
		//here stream is variable its default value is null so null==null true
		//index and stream.length this is not equal so here we are using ||or operator
		//|| this operator means any one its equal its come true
		if(stream==null||index>=stream.length) {
			System.out.println("Array is null or check the length");
		}else {
			//save operation
			//here stream.length bigger than index so it is true so it will come inside 
			if(index<stream.length) {
				//stream ge assign the variable
				stream[index]=streamName;
				//here increasing
				index++;
				//we know that it is true so we directly write it
				return true;
			}
		}
	
		return false;
	}

	@Override
	public String[] read() {
		return stream;
	}

}
