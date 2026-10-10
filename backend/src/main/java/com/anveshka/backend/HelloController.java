package com.anveshka.backend;

import org.hibernate.internal.util.StringHelper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController  // Spring ko batata hai ki ye class HTTP request handle karegi
public class HelloController {
    @GetMapping("/hello")  // Browser se / Url par GET request ane par method chalta h
    public String home() {
        return "Anveshka is runnig! Your Journey starts here.";
    }

}
