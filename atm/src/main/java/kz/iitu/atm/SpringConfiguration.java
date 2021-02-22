package kz.iitu.atm;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.ArrayList;
import java.util.List;

@Configuration
@ComponentScan("kz.iitu.atm")
@PropertySource("application.properties")
public class SpringConfiguration {

    @Bean
    public List<User> accountList() {
        List<User> userList = new ArrayList<>();
        userList.add(new User(123, "Abzal", 1234, 42500));
        userList.add(new User(456, "Aidos", 5678, 21250));
        userList.add(new User(789, "Erdos", 4321, 32800));
        userList.add(new User(321, "Zhanat", 2345, 46900));

        return userList;
    }
}
