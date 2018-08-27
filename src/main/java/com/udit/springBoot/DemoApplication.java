package com.udit.springBoot;

import com.udit.Controllers.GreetingControllerImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.udit")
/* we generally do not use @ComponentScan Here as @SpringBootApplication auutomatically
scan the components, but from the package in which it is defined now as we chnage the
package of DemoApplication class, so we use @ComponentScan explicitly and give it base
package of "com.udit" to scan, also we can give it multiple base packages
 */
public class DemoApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(DemoApplication.class, args);

        GreetingControllerImpl greetingController = (GreetingControllerImpl) ctx.getBean("greetingControllerImpl");
        greetingController.getGreeting();
	}
}
