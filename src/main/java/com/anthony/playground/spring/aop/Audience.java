package com.anthony.playground.spring.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Audience {
	
	@Pointcut( " execution (**com.anthony.playground.spring.aop.Performance.perform(..) ) ")
    public void performance() {}

	@Before( "performance()" )
	public void silenceAudience()
	{
		System.out.println("Silence");
	}
	
	@After( "performance()" )
	public void applause()
	{
		System.out.println("Applause");
	}
	
	@AfterThrowing( "performance()" )
	public void badPerformance()
	{
		System.out.println("Refund");
	}
}
