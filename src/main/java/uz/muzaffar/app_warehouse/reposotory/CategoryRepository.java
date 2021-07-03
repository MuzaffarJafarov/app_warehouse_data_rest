package uz.muzaffar.app_warehouse.reposotory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.muzaffar.app_warehouse.entity.Category;
import uz.muzaffar.app_warehouse.entity.Warehouse;
import uz.muzaffar.app_warehouse.projection.CustomCategory;

@RepositoryRestResource(path = "address",excerptProjection = CustomCategory.class)
public interface CategoryRepository extends JpaRepository<Category,Integer> {
}
