package uz.muzaffar.app_warehouse.service;

import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import uz.muzaffar.app_warehouse.entity.Attachment;
import uz.muzaffar.app_warehouse.entity.AttachmentContent;
import uz.muzaffar.app_warehouse.payload.AttachmentDto;
import uz.muzaffar.app_warehouse.payload.Result;
import uz.muzaffar.app_warehouse.reposotory.AttachmentContentRepository;
import uz.muzaffar.app_warehouse.reposotory.AttachmentRepository;


import java.util.Iterator;
import java.util.List;
import java.util.Optional;

@Service
public class AttachmentService {

    @Autowired
    AttachmentRepository attachmentRepository;

    final
    AttachmentContentRepository attachmentContentRepository;

    public AttachmentService(AttachmentContentRepository attachmentContentRepository) {
        this.attachmentContentRepository = attachmentContentRepository;
    }

    @SneakyThrows
    public Result uploadService(MultipartHttpServletRequest request) {
        Iterator<String> fileNames = request.getFileNames();
        MultipartFile file = request.getFile(fileNames.next());

        Attachment attachment = new Attachment();
        attachment.setName(file.getOriginalFilename());
        attachment.setSize(file.getSize());
        attachment.setContentType(file.getContentType());
        Attachment save = attachmentRepository.save(attachment);

        AttachmentContent attachmentContent = new AttachmentContent();
        attachmentContent.setAttachment(save);
        attachmentContent.setBytes(file.getBytes());
        attachmentContentRepository.save(attachmentContent);
        return new Result("File has been saved successfully! ", true, save.getId());
    }

    public List<Attachment> getAllAttachments() {
        return attachmentRepository.findAll();
    }

    public Attachment getAttachment(Integer id) {
        Optional<Attachment> byId = attachmentRepository.findById(id);
        return byId.orElse(null);
    }

    public Result deleteAttachment(Integer id) {
        Optional<Attachment> byId = attachmentRepository.findById(id);
        if (!byId.isPresent())
            return new Result("Attachment not found !", false);
        attachmentRepository.deleteById(id);
        return new Result("Attachment has been successfully deleted! ", true);
    }

    public Result editAttachment(AttachmentDto attachmentDto, Integer id) {
        Optional<Attachment> byId = attachmentRepository.findById(id);
        if (!byId.isPresent())
            return new Result("Attachment not found !", false);
        Attachment attachment = byId.get();
        attachment.setName(attachmentDto.getName());
        attachment.setSize(attachmentDto.getSize());
        attachment.setContentType(attachmentDto.getContentType());
        Boolean aBoolean = attachmentRepository.existsByNameAndContentTypeAndSize(attachmentDto.getName(), attachment.getContentType(), attachment.getSize());
        if (aBoolean)
            return new Result("This type of Attachment has already exist! ", false);
        attachmentRepository.save(attachment);
        return new Result("Attachment has been edited usccessflly ", true);
    }
}
