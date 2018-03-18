package csl.rest;

import csl.database.FoodRepository;
import csl.database.model.Food;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

/**
 * Created by Carmen on 18-3-2018.
 */
@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/food")
public class FoodService {

    private FoodRepository foodRepository = new FoodRepository();

    @RequestMapping(value = "",
            method = GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Food> getAllFood() {
        return foodRepository.getAllFood();
    }

    @CrossOrigin(origins = {"*", "http://localhost:4200"})
    @RequestMapping(value = "/newFood",
            method = POST,
            headers = {"Content-Type=application/json"},
            params = {"name"})
    @ResponseBody
    public void insertFood(@RequestParam("name") String name) {
        int insertedRows = foodRepository.insertFood(new Food(1, name));
        System.out.println(insertedRows + " row(s) inserted");
    }

}
