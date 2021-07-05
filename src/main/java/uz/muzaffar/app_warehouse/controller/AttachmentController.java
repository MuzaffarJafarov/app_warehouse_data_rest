package uz.muzaffar.app_warehouse.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import uz.muzaffar.app_warehouse.payload.Result;
import uz.muzaffar.app_warehouse.service.AttachmentService;

@RestController
@RequestMapping("/attachment")
public class AttachmentController {

    @Autowired
    AttachmentService attachmentService;
    @PostMapping
    public Result upload(MultipartHttpServletRequest request){
        Result result = attachmentService.uploadService(request);
        return result;
    }

}
