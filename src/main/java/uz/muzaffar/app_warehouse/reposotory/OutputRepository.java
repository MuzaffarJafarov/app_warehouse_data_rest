package uz.muzaffar.app_warehouse.reposotory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.muzaffar.app_warehouse.entity.Warehouse;
import uz.muzaffar.app_warehouse.projection.CustomOutput;

@RepositoryRestResource(path = "address",excerptProjection = CustomOutput.class)
public interface OutputRepository extends JpaRepository<Warehouse,Integer> {
}
