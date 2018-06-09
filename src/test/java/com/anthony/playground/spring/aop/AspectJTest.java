package com.anthony.playground.spring.aop;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=ConcertConfig.class)
public class AspectJTest {

    @Autowired
    private Performance concert;

    @Test
    public void aspectTest() {
        System.out.println("Start!");

        concert.perform();
    }
}
