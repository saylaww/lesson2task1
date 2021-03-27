package uz.pdp.task1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.task1.entity.Attachment;
import uz.pdp.task1.entity.AttachmentContent;
import uz.pdp.task1.projection.CustomAttachment;
import uz.pdp.task1.projection.CustomAttachmentContent;

@RepositoryRestResource(path = "attachmentContent",collectionResourceRel = "attachmentContentList", excerptProjection = CustomAttachmentContent.class)
public interface AttachmentContentRepository extends JpaRepository<AttachmentContent, Integer> {



}
