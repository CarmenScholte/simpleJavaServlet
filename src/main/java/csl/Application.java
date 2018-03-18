package csl;

import csl.database.DatabaseHelper;
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

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
        DatabaseHelper.createTable();
    }

}