package uz.muzaffar.app_warehouse.reposotory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.muzaffar.app_warehouse.entity.Attachment;


public interface AttachmentRepository extends JpaRepository<Attachment,Integer> {
    Boolean existsByNameAndContentTypeAndSize(String name, String contentType, long size);
}
