package guru.springframework.sfg.ppo.controllers;

import guru.springframework.sfg.ppo.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
@Controller
public class SetterInjectedController {


    private GreetingService greetingService;
    
    @Autowired
    public void setGreetingService( @Qualifier("setterInjectionGreetingService") GreetingService greetingService){
        this.greetingService = greetingService;
    }

    public String detGreeting(){
        
        return greetingService.sayGreeting();
    }
}
