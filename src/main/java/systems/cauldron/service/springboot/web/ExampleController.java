package systems.cauldron.service.springboot.web;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class ExampleController {
    @RequestMapping("/")
    public String handle() {
        return "Hey";
    }
}
