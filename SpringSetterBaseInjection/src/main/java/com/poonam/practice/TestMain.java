package com.poonam.practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
public static void main(String[] args) {
	ApplicationContext ap=new ClassPathXmlApplicationContext("Spring.xml");
		Student student=(Student) ap.getBean("s");
		student.getMessage("I am java Developer");
}
}
