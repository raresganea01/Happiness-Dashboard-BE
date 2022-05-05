package com.example.demohd;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication(scanBasePackages= {"dbutils"})
public class DemoHdApplication{

    public static void main(String[] args) {
        SpringApplication.run(DemoHdApplication.class, args);
    }

    //@Autowired(required = false)
    @Bean
    CommandLineRunner init() {
        //UserRepository userRepository
        System.out.println("mesaj");
        return args -> {
            Stream.of("John", "Julie", "Jennifer", "Helen", "Rachel").forEach(name -> {
                User user = new User(name, name.toLowerCase() + "@domain.com");
                //userRepository.save(user);
                //salvez manual in DB
                System.out.println(user.toString());
            });
            //afisez manual din DB
            //userRepository.findAll().forEach(System.out::println);
        };
    }

}
