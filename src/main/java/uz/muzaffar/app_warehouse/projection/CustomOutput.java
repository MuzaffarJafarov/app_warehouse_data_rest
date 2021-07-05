package uz.muzaffar.app_warehouse.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.muzaffar.app_warehouse.entity.Output;

@Projection(types = Output.class)
public interface CustomOutput {
    Integer getId();

    String getName();
}
