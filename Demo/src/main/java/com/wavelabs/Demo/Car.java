package com.wavelabs.Demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle {
	
	@Autowired
	private Tyre tyre;
	
	public Tyre getTyre() {
		return tyre;
	}

	public void setTyre(Tyre tyre) {
		this.tyre = tyre;
	}

	public void drive() {
		System.out.println("I am driving the car..."+tyre);
		System.out.println(tyre);
	}

	@Override
	public String toString() {
		return "Car [tyre=" + tyre + "]";
	}
	
	
}
