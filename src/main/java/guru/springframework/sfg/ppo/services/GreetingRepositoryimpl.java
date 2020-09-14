package guru.springframework.sfg.ppo.services;

import org.springframework.stereotype.Component;

@Component
public class GreetingRepositoryimpl implements GreetingRepository{
    @Override
    public String getEnglishGreeting() {
        return "Hello - Primary Greeting service";
    }

    @Override
    public String getSpanishGreeting() {
        return "Servicio de Saludo Primario";
    }

    @Override
    public String getGermanGreeting() {
        return "Primarer Grubdienst";
    }
}
