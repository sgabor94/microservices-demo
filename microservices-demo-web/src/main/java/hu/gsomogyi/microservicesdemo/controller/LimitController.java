package hu.gsomogyi.microservicesdemo.controller;

import hu.gsomogyi.microservicesdemo.model.Limit;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(LimitController.BASE_URL)
public class LimitController {

    static final String BASE_URL = "/api/limits";

    @GetMapping
    public Limit retrieveLimits() {
        return new Limit(1, 1000);
    }
}
