package com.vishwa;

import com.vishwa.greeting.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class MyApp {
  /**
   * @Qualifier is used to give the hint to
   * spring to pick which bean
   */
  @Qualifier("french") //This I can read from config
  @Autowired
  GreetingService greetingService ;

  public void sendMessage(){
    greetingService.greet();
  }
}
