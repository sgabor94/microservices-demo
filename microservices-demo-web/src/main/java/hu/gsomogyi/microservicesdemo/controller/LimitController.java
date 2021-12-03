package hu.gsomogyi.microservicesdemo.controller;

import hu.gsomogyi.microservicesdemo.Configuration;
import hu.gsomogyi.microservicesdemo.model.Limit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(LimitController.BASE_URL)
public class LimitController {

    static final String BASE_URL = "/api/limits";

    @Autowired
    private Configuration configuration;

    @GetMapping
    public Limit retrieveLimits() {
        return new Limit(configuration.getMinimum(), configuration.getMaximum());
    }
}
