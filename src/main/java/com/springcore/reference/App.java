package com.springcore.reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.primitive.Student;

/**
 * printing data from bean using IOC container
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/primitive/config.xml");
        Student student1=(Student) context.getBean("student1");
        Student student2=(Student) context.getBean("student2");
        Student student3=(Student) context.getBean("student3");

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
    }
}
