package systems.cauldron.service.springboot.data;

import org.springframework.stereotype.Repository;
import systems.cauldron.service.springboot.domain.ExampleEntity;

@Repository
public class ExampleData {

    public ExampleEntity getData() {
        ExampleEntity entity = new ExampleEntity();
        entity.setId(1);
        entity.setName("Example");
        return entity;
    }

}
