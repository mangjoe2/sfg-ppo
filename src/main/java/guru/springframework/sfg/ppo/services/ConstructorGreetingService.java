package guru.springframework.sfg.ppo.services;


import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello World ---- Constructor!!!";
    }
}
