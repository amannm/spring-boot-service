package systems.cauldron.service.springboot.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import systems.cauldron.service.springboot.domain.ExampleEntity;
import systems.cauldron.service.springboot.orchestration.ExampleOrchestrator;

@RestController
public class ExampleController {

    @Autowired
    private ExampleOrchestrator exampleOrchestrator;

    @RequestMapping("/")
    public String get() {
        return "root";
    }

    @RequestMapping("/test")
    public ExampleEntity getTest() {
        return exampleOrchestrator.getData();
    }
}
