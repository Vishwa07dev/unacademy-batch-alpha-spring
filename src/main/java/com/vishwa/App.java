package com.vishwa;

import com.vishwa.greeting.GreetingService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App {

  public static void main(String[] args) {
    System.out.println("Hello Spring");

    /**
     * Retrieve the bean from the spring container
     */
    ApplicationContext ctx =
        new AnnotationConfigApplicationContext("com.vishwa");

   Person person = (Person) ctx.getBean("person");

   Person person1 = (Person) ctx.getBean("person");

    System.out.println(person.hashCode());
    System.out.println(person1.hashCode());

  }
}
