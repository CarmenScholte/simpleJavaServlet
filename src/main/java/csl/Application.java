package csl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableAutoConfiguration
@RestController
public class Application {

    @RequestMapping("/")
    String home() {
        return "Simple Java Servlet by CSL";
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}