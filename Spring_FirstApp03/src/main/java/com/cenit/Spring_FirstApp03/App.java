package com.cenit.Spring_FirstApp03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext app=new ClassPathXmlApplicationContext("beans.xml");
       Logger log=(Logger) app.getBean("logger");
       log.writeFile("welcome to the file message");
       log.consoleWrite("Console messsage ");
       ((ClassPathXmlApplicationContext)app).close();
    }
}
