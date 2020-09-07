package guru.springframework.sfg.ppo.controllers;


import org.springframework.stereotype.Controller;

/**
 * Created by Mangazie on 09/06/2020
 */
@Controller
public class MyController {
    public String sayHello(){
        System.out.println("Hello world");

        return "Hi Folks!!!";
    }

}
