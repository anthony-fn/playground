package com.anthony.playground.spring.aop;

import org.springframework.stereotype.Component;

@Component
public class Concert implements Performance{

	@Override
	public void perform() {
		System.out.println("Performance");
	}

}
