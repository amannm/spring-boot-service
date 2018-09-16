package systems.cauldron.service.springboot.orchestration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import systems.cauldron.service.springboot.data.ExampleData;
import systems.cauldron.service.springboot.domain.ExampleEntity;

@Service
public class ExampleOrchestrator {

    @Autowired
    private ExampleData exampleData;

    public ExampleEntity getData() {
        return exampleData.getData();
    }

}
