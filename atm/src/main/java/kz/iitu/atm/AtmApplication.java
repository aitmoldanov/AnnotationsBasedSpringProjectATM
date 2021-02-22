package kz.iitu.atm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

@SpringBootApplication
public class AtmApplication {

    public static void main(String[] args) {
        SpringApplication.run(AtmApplication.class, args);
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        ATM atm = context.getBean("atm", ATM.class);
        System.out.println(atm);

        List<User> userList = context.getBean("accountList", List.class);
        System.out.println("accountList = " + userList);

    }

}
