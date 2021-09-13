
package com.spring.ex02;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;


public class PersonTest2 {
	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("person.xml"));
//		생성은 한번만함
		
		//가져다쓰기 1
		PersonService person1 = (PersonService) factory.getBean("personService1");		
		person1.sayHello();
		
		
		System.out.println();
		
		//가져다쓰기2
		PersonService person2 = (PersonService) factory.getBean("personService2");
		person2.sayHello();
	}
}
