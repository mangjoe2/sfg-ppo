package guru.springframework.sfg.ppo.controllers;
/**
 * Most prefer Method!!!
 */

import guru.springframework.sfg.ppo.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorInjectedControllerTest {

    ConstructorInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new ConstructorInjectedController(new ConstructorGreetingService());
    }

    @Test
    void detGreeting() {

        System.out.println(controller.detGreeting());
    }
}