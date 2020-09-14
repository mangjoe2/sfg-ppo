package guru.springframework.sfg.ppo.services;

public class PrimaryGreetingService implements GreetingService{

    private  GreetingRepository greetingRepository;

    public PrimaryGreetingService(GreetingRepository greetingRepository){
        this.greetingRepository = greetingRepository;
    }
    @Override
    public String sayGreeting() {
        return greetingRepository.getEnglishGreeting();
    }
}
