package uz.muzaffar.app_warehouse.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.muzaffar.app_warehouse.entity.User;

import java.util.Set;
@Projection(types = User.class)
public interface CustomUser {
    Integer getId();

    boolean isActive();

    Integer getCode();

    String getFirstName();

    String getLastName();

    String getPassword();

    String getPhoneNumber();

    Set<WarehouseInfo> getWarehouses();

    interface WarehouseInfo {
        Integer getId();

        boolean isActive();

        String getName();
    }
}
