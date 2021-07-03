package com.vishwa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


/**
 * It will create the person bean and keep in Spring Container
 *
 * Person has Car -> True
 *
 * Manual :
 *
 * 1. create the car object
 * 2. Create the Person object, and person
 * object should have the car object set inside it
 */
@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Person {

  private String name ;
  private int age ;

  /**
   * It tells spring that the bean you have
   * created for car should be injected here
   */
  @Autowired
  private Car car;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public Car getCar() {
    return car;
  }

  public void setCar(Car car) {
    this.car = car;
  }

  public void dance(){
    System.out.println("Dancing in the tunes of Spring");
  }

  @Override
  public String toString() {
    return "Person{" + "name='" + name + '\'' + ", age=" + age + ", car=" + car + '}';
  }
}
