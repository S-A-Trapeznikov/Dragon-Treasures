package com.epam.trapeznikau.runner;

import java.util.Iterator;

import com.epam.trapeznikau.bean.Treasure;
import com.epam.trapeznikau.service.ServiceFactory;

public class Runner {
	
	public static void main(String args []){
		
		ServiceFactory factory = ServiceFactory.getInstance();

		Iterator<Treasure> it = factory.getOperation().read().iterator();
		while (it.hasNext()){
			System.out.println(it.next()+"   ");			
		}
		
	}

}
