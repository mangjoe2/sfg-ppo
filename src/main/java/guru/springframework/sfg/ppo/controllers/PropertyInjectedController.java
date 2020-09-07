package guru.springframework.sfg.ppo.controllers;

import guru.springframework.sfg.ppo.services.GreetingService;

public class PropertyInjectedController {

    public GreetingService greetingService;
    
    public String detGreeting(){
        return greetingService.sayGreeting();
    }

}
