package guru.springframework.sfg.ppo.controllers;

import guru.springframework.sfg.ppo.services.GreetingService;

public class SetterInjectedController {

    private GreetingService greetingService;

    public void setGreetingService(GreetingService greetingService){
        this.greetingService = greetingService;
    }

    public String detGreeting(){
        return greetingService.sayGreeting();
    }
}
