package com.udit.Services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * Created by udit on 18/9/17.
 */
@Component
@Profile("default")
//to mark it as default as well as english profile you can do @Profile({"default","english"})
public class HelloWorldEngServceImpl implements HelloWorldService{
    @Override
    public String getGreeting() {
       return "Hello World";
    }
}
