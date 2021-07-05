package uz.muzaffar.app_warehouse.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.muzaffar.app_warehouse.entity.Product;

@Projection(types = Product.class)
public interface CustomProduct {
    Integer getId();

    String getName();
}
