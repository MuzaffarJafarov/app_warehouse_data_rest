package uz.muzaffar.app_warehouse.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.muzaffar.app_warehouse.entity.Supplier;

@Projection(types = Supplier.class)
public interface CustomSupplier {
    Integer getId();

    String getName();

    String getPhoneNumber();
}
