package me.cicd.testwebapp;

import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class Controller {

    @GetMapping("values")
    public List<String> values() {
        return Arrays.asList("green", "blue", "red");
    }

}
