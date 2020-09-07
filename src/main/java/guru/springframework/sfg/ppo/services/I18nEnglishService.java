package guru.springframework.sfg.ppo.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("EN")
@Service("i18Service")
public class I18nEnglishService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello World ----- English";
    }
}
