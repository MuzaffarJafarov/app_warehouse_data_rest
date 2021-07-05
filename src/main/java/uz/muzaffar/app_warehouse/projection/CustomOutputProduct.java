package uz.muzaffar.app_warehouse.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.muzaffar.app_warehouse.entity.OutputProduct;

@Projection(types = OutputProduct.class)
public interface CustomOutputProduct {
    Integer getId();

    String getName();
}
