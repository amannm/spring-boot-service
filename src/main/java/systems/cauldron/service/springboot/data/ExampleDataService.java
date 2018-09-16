package systems.cauldron.service.springboot.data;

import org.springframework.stereotype.Service;
import systems.cauldron.service.springboot.domain.ExampleEntity;

@Service
public class ExampleDataService {

    public ExampleEntity getData() {
        ExampleEntity entity = new ExampleEntity();
        entity.setId(1);
        entity.setName("Example");
        return entity;
    }

}
