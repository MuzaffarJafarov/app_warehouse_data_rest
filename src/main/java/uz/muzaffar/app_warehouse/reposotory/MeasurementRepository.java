package uz.muzaffar.app_warehouse.reposotory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.muzaffar.app_warehouse.entity.Warehouse;
import uz.muzaffar.app_warehouse.projection.CustomMeasurement;

@RepositoryRestResource(path = "address",excerptProjection = CustomMeasurement.class)
public interface MeasurementRepository extends JpaRepository<Warehouse,Integer> {
}
