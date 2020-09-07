package guru.springframework.sfg.ppo.controllers;

import guru.springframework.sfg.ppo.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {
    
    @Qualifier("propertyInjectedGreetingService")
    @Autowired
    public GreetingService greetingService;
    
    public String detGreeting(){
        return greetingService.sayGreeting();
    }

}
