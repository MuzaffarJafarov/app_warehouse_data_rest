package uz.muzaffar.app_warehouse.reposotory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.muzaffar.app_warehouse.entity.InputProduct;
import uz.muzaffar.app_warehouse.entity.Warehouse;
import uz.muzaffar.app_warehouse.projection.CustomInputProduct;

@RepositoryRestResource(path = "address",excerptProjection = CustomInputProduct.class)
public interface InputProductRepository extends JpaRepository<InputProduct,Integer> {
}
