package com.udit.Controllers;

import com.udit.Services.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by udit on 18/9/17.
 */
@Controller
public class GreetingControllerImpl implements GreetingController {
    HelloWorldService helloWorldService;

    public void setHelloWorldService(HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }

    @Override
    public void getGreeting(){
        String greeting = helloWorldService.getGreeting();
        System.out.println(greeting);
    }
}
