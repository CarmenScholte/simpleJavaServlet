package csl;

import csl.database.model.Food;
import csl.rest.FoodService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
        FoodService fc = new FoodService();
        fc.insertFood("Banana");
        List<Food> allFood = fc.getAllFood();
        System.out.println(allFood.toString());

    }

}