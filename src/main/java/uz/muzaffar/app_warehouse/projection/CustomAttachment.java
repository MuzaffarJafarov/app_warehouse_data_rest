package uz.muzaffar.app_warehouse.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.muzaffar.app_warehouse.entity.Attachment;

@Projection(types = Attachment.class)
public interface CustomAttachment {
    Integer detId();

    String getName();

    Long getSize();

}
