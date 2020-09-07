package guru.springframework.sfg.ppo.controllers;
/**
 * Most prefer Method!!!
 */

import guru.springframework.sfg.ppo.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConstructorInjectedControllerTest {

    ConstructorInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new ConstructorInjectedController(new GreetingServiceImpl());
    }

    @Test
    void detGreeting() {

        System.out.println(controller.detGreeting());
    }
}