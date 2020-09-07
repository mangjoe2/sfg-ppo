package guru.springframework.sfg.ppo.controllers;

import guru.springframework.sfg.ppo.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectedControllerTest {

    PropertyInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new PropertyInjectedController();

        controller.greetingService = new ConstructorGreetingService();
    }

    @Test
    void detGreeting() {
        System.out.println(controller.detGreeting());
    }
}