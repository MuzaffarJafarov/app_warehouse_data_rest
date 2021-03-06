package uz.muzaffar.app_warehouse.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.muzaffar.app_warehouse.entity.Client;

@Projection(types = Client.class)
public interface CustomClient {
    Integer getId();

    String getName();
}
