package com.shiyanlou.demo.loosely_coupled;

public class OutputHelper {

	IOutputGenerator generator;
	
	public void generateOutput(){
		generator.generateOutput();
	}
	
	public void setGenerator(IOutputGenerator generator) {
		this.generator = generator;
	}
	
}
