package com.codecool.test.test2;
import org.springframework.context.ApplicationContext; 
import org.springframework.context.support.ClassPathXmlApplicationContext; 

/**
 * Hello world!
 *
 */
public class Main 
{
    public static void main( String[] args )
    {
    	{ 
    		ApplicationContext appCon=new ClassPathXmlApplicationContext("applicationProperties.xml"); 
    		StudentBean factory=(StudentBean)appCon.getBean("studentbean"); 
    		factory.displayInfo(); 
    		}
    	
    }
}
