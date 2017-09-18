package com.udit.Services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * Created by udit on 18/9/17.
 */
@Component
@Profile("spanish")
public class HelloWorldSpanImpl implements HelloWorldService {

    @Override
    public String getGreeting() {
        return "Hola Munda";
    }
}
