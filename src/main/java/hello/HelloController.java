package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

    @RequestMapping("/greeting/*")
    public String hello() {
        return "Hello from Spring Boot!";
    }
}
