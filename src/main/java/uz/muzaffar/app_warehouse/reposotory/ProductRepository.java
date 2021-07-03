package uz.muzaffar.app_warehouse.reposotory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.muzaffar.app_warehouse.entity.Warehouse;
import uz.muzaffar.app_warehouse.projection.CustomProduct;

@RepositoryRestResource(path = "address",excerptProjection = CustomProduct.class)
public interface ProductRepository extends JpaRepository<Warehouse,Integer> {
}
