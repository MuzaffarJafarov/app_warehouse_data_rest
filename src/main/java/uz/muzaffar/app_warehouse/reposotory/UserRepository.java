package uz.muzaffar.app_warehouse.reposotory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.muzaffar.app_warehouse.entity.User;
import uz.muzaffar.app_warehouse.projection.CustomUser;

@RepositoryRestResource(path = "user",excerptProjection = CustomUser.class)
public interface UserRepository extends JpaRepository<User, Integer> {
}
