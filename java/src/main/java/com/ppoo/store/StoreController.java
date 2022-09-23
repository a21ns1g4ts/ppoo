package com.ppoo.store;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class StoreController {
    @RequestMapping("/")
    public String index() {
        return "{\"json\":0000}";
    }
}
