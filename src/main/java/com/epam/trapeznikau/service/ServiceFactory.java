package com.epam.trapeznikau.service;

public class ServiceFactory {
	
	private final static ServiceFactory instance = new ServiceFactory();
	
	private Operation operation = new Operation();
	
	private ServiceFactory(){};
	
	public static ServiceFactory getInstance(){
		return instance;
	}
	
	public Operation getOperation(){
		return operation;
	}
}
