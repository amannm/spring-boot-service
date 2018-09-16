package systems.cauldron.service.springboot.web;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class ExampleController {
    @GetMapping("/")
    public String handle() {
        return "Hey";
    }
}
