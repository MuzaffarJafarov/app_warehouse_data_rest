package uz.muzaffar.app_warehouse.reposotory;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.muzaffar.app_warehouse.entity.AttachmentContent;

public interface AttachmentContentRepository extends JpaRepository<AttachmentContent,Integer> {
}
