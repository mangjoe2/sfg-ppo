package guru.springframework.sfg.ppo.controllers;

import guru.springframework.sfg.ppo.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterInjectedControllerTest {

    SetterInjectedController setterInjectedController;

    @BeforeEach
    void setUp() {

        setterInjectedController = new SetterInjectedController();
        setterInjectedController.setGreetingService(new ConstructorGreetingService());
    }

    @Test
    void detGreeting() {
        System.out.println(setterInjectedController.detGreeting());
    }
}