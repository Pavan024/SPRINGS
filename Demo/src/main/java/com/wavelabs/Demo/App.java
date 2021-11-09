package com.wavelabs.Demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
//      Car car=new Car();
//      car.drive();
//		Bike bike = new Bike();
//		bike.drive();
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

		Vehicle obj = (Vehicle) context.getBean("car");
		obj.drive();
		System.out.println(obj);

//		Tyre tyre = (Tyre) context.getBean("tyre");
//		System.out.println(tyre);
	}
}
