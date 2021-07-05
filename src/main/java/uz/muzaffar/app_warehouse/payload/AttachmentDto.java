package uz.muzaffar.app_warehouse.payload;

import lombok.Data;

@Data
public class AttachmentDto {

    private String name;
    private Long size;
    private String ContentType;
}
