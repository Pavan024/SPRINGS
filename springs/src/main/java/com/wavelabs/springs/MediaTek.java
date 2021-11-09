package com.wavelabs.springs;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class MediaTek implements MobileProcessor {

	public void getCpu() {
		System.out.println("2nd best cpu...");
	}

}
