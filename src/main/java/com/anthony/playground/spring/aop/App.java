package com.anthony.playground.spring.aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

@ContextConfiguration(classes=ConcertConfig.class,loader=AnnotationConfigContextLoader.class)
public class App {

	@Autowired
	private static Audience audience;
	
	public static void main( String [] args )
	{

		// XML 配置 AOP
		ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/spring/aop/aspectjconfig.xml");
        Monkey monkey = (Monkey) context.getBean("monkey");  
        try {  
            monkey.stealPeaches("孙大圣的大徒弟");  
        }  
        catch(Exception e) {}

        //ApplicationContext context1 = new
        System.out.println("Start!");

        if( audience == null )
        {
            System.out.println("Why");
        }

        Concert concert = new Concert();
        concert.perform();
	}
}
