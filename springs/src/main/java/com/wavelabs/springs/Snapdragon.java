package com.wavelabs.springs;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class Snapdragon implements MobileProcessor {

	public void getCpu() {
		System.out.println("world's best cpu...");
	}
}
