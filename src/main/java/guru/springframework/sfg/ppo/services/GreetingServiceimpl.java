package guru.springframework.sfg.ppo.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceimpl implements GreetingService{

    public final String HELLO_GURU = "Hello Guru !!! - Original";
    @Override
    public String sayGreeting() {
        return HELLO_GURU;
    }
}
