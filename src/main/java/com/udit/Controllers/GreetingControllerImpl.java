package com.udit.Controllers;

import com.udit.Services.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * Created by udit on 18/9/17.
 */
@Controller
public class GreetingControllerImpl implements GreetingController {
    HelloWorldService helloWorldService;
    HelloWorldService helloWorldServiceGerman;
    HelloWorldService helloWorldServiceRussian;

    @Autowired
    public void setHelloWorldService(HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }

    //@Qualifier is given a bean Id which is by default the @Bean method name
    @Autowired
    @Qualifier("helloWorldServiceGerman")
    public void setHelloWorldServiceGerman(HelloWorldService helloWorldServiceGerman) {
        this.helloWorldServiceGerman = helloWorldServiceGerman;
    }

    //here @Qualifier is given the modified bean Id
    @Autowired
    @Qualifier("russian")
    public void setHelloWorldServiceRussian(HelloWorldService helloWorldServiceRussian) {
        this.helloWorldServiceRussian = helloWorldServiceRussian;
    }

    @Override
    public void getGreeting(){
        String greeting = helloWorldService.getGreeting();
        String greetingGerman = helloWorldServiceGerman.getGreeting();
        String greetingRussian = helloWorldServiceRussian.getGreeting();
        System.out.println(greeting);
        System.out.println(greetingGerman);
        System.out.println(greetingRussian);
    }
}
