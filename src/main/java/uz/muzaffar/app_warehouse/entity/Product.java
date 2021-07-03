package uz.muzaffar.app_warehouse.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import uz.muzaffar.app_warehouse.entity.template.AbsEntity;

import javax.persistence.*;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Product extends AbsEntity {

    private Integer code;

    @ManyToOne(optional = true)
    private Category category;


    @OneToOne
    private Attachment photo;

    @ManyToOne(optional = false)
    private Measurement measurement;

}
