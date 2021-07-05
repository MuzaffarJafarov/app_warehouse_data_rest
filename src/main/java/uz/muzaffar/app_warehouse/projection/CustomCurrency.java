package uz.muzaffar.app_warehouse.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.muzaffar.app_warehouse.entity.Currency;

@Projection(types = Currency.class)
public interface CustomCurrency {
    Integer getId();

    String getName();
}
