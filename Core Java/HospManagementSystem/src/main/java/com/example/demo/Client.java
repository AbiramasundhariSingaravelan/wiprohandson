package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Resource r=new ClassPathResource("beans.xml");
		BeanFactory b=new XmlBeanFactory(r);*/
		ApplicationContext ac=new ClassPathXmlApplicationContext("beans2.xml");
		A a=(A)ac.getBean("aBean");
		a.print();
	}

}
