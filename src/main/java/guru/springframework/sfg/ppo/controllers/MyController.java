package guru.springframework.sfg.ppo.controllers;


import guru.springframework.sfg.ppo.services.GreetingService;
import org.springframework.stereotype.Controller;

/**
 * Created by Mangazie on 09/06/2020
 */
@Controller
public class MyController {
    
    private final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){

        return greetingService.sayGreeting();
    }

}
