package uz.muzaffar.app_warehouse.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Result {

    private String message;
    private boolean success = false;
    private Object  object;

    public Result(Object object) {
        this.object = object;
    }

    public Result(String message, boolean success) {
        this.message = message;
        this.success = success;
    }
}
