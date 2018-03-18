package csl.rest;

import csl.database.FoodRepository;
import csl.database.model.Food;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Created by Carmen on 18-3-2018.
 */
@Controller
@RequestMapping("/food")
public class FoodService {

    private FoodRepository foodRepository = new FoodRepository();

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Food> getAllFood() {
        return foodRepository.getAllFood();
    }

    @RequestMapping(value = "/newFood/", method = RequestMethod.POST)
    public void insertFood(@RequestParam("name") String name) {
        int insertedRows = foodRepository.insertFood(new Food(1, name));
        System.out.println(insertedRows + " row(s) inserted");
    }

}
