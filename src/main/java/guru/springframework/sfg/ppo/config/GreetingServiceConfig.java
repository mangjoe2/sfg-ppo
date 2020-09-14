package guru.springframework.sfg.ppo.config;

import guru.springframework.sfg.ppo.services.GreetingRepository;
import guru.springframework.sfg.ppo.services.GreetingService;
import guru.springframework.sfg.ppo.services.GreetingServiceFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class GreetingServiceConfig {

    @Bean
    GreetingServiceFactory greetingServiceFactory(GreetingRepository repository){
        return new GreetingServiceFactory(repository);
    }
    @Bean
    @Primary
    @Profile({"default","en"})
    GreetingService PrimaryGreetingService(GreetingServiceFactory greetingServiceFactory){
        return greetingServiceFactory.createGreetingService("en");
    }
    @Bean
    @Primary
    @Profile("es")
    GreetingService PrimarySpanishGreetingService(GreetingServiceFactory greetingServiceFactory){
        return greetingServiceFactory.createGreetingService("es");
    }
    @Bean
    @Primary
    @Profile("de")
    GreetingService PrimaryGermanGreetingService(GreetingServiceFactory greetingServiceFactory){
        return greetingServiceFactory.createGreetingService("de");
    }

}