package com.spring.event.handling;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

        context.start();

        HelloWorld helloWorld = context.getBean("helloWorld", HelloWorld.class);
        helloWorld.getMessage();

        context.stop();
    }
}
