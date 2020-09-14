package guru.springframework.sfg.ppo;

import ch.qos.logback.core.net.SyslogOutputStream;
import guru.springframework.sfg.ppo.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(Application.class, args);
		System.out.println();

		MyController controller = (MyController) ctx.getBean("myController");
		System.out.println(controller.sayHello());
		System.out.println(ctx.getBean(PropertyInjectedController.class).detGreeting());
		System.out.println(ctx.getBean(SetterInjectedController.class).detGreeting());
		System.out.println(ctx.getBean(ConstructorInjectedController.class).detGreeting());

	}
}
