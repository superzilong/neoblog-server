package me.zilong.simpleblog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude= SecurityAutoConfiguration.class)
public class SimpleBlogApplication {

    public static void main(String[] args) {
        SpringApplication.run(SimpleBlogApplication.class, args);
    }

}
