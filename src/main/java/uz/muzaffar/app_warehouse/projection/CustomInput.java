package uz.muzaffar.app_warehouse.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.muzaffar.app_warehouse.entity.Input;

@Projection(types = Input.class)
public interface CustomInput {
    Integer getId();

    String getName();
}
