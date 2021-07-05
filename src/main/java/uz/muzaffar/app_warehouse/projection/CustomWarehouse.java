package uz.muzaffar.app_warehouse.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.muzaffar.app_warehouse.entity.Warehouse;

@Projection(types = Warehouse.class)
public interface CustomWarehouse {
    Integer getId();

    String getName();
}
