package com.ldd.observer;

public class ObserverImp implements Observer{

	@Override
	public void onChange() {
		
		System.out.println("data changed");
		
	}

}
