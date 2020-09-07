package guru.springframework.sfg.ppo.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"ES", "default"})
@Service("i18Service")
public class I18nSpanishService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hola Mundo ---- Espagnol";
    }
}
