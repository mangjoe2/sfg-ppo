package guru.springframework.sfg.ppo;

import ch.qos.logback.core.net.SyslogOutputStream;
import guru.springframework.sfg.ppo.controllers.*;
import guru.springframework.sfg.ppo.examplebeans.FakeDataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(Application.class, args);
		System.out.println();

		MyController controller = (MyController) ctx.getBean("myController");
		FakeDataSource fakeDataSource =  (FakeDataSource) ctx.getBean(FakeDataSource.class);

		System.out.println(fakeDataSource.getUser());
		System.out.println(fakeDataSource.getPassword());
		System.out.println(fakeDataSource.getUrl());

	}
}
