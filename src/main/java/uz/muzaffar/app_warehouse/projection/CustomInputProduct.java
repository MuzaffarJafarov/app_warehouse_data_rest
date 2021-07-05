package uz.muzaffar.app_warehouse.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.muzaffar.app_warehouse.entity.InputProduct;

@Projection(types = InputProduct.class)
public interface CustomInputProduct {
    Integer getId();

    String getName();
}
