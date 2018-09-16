package systems.cauldron.service.springboot.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import systems.cauldron.service.springboot.data.ExampleData;
import systems.cauldron.service.springboot.domain.ExampleEntity;

@RestController
@RequestMapping("/")
public class ExampleController {

    @Autowired
    private ExampleData exampleData;

    @GetMapping
    public String get() {
        return "root";
    }

    @GetMapping("test")
    public ExampleEntity getTest() {
        return exampleData.getData();
    }
}
