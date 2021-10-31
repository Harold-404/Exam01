package com.javasec.exam01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Controller
public class Upload {

    // 设置保存文件的路径，不安全的web路径下
    private static final String UPLOADED_FOLDER = System.getProperty("user.dir") + "/src/main/resources/static/file/";

    @GetMapping("/upload")
    public String uploadStatus() {
        return "upload";
    }

    @PostMapping("/upload")
    public String singleFileUpload(@RequestParam("file") MultipartFile file,
                                   RedirectAttributes redirectAttributes) {
        if (file.isEmpty()) {
            redirectAttributes.addFlashAttribute("message", "请选择要上传的文件");
            return "redirect:upload";
        }

        try {
            byte[] bytes = file.getBytes();
            Path dir = Paths.get(UPLOADED_FOLDER);
            Path path = Paths.get(UPLOADED_FOLDER + file.getOriginalFilename());

            if (!Files.exists(dir)) {
                Files.createDirectories(dir);
            }
            Files.write(path, bytes);
            System.out.println("[+] 上传文件成功：" + path);
            redirectAttributes.addFlashAttribute("message", "上传文件成功：" + path + "");
            return "redirect:upload";
        } catch (Exception e) {
            redirectAttributes.addFlashAttribute("message", e.toString());
            return "redirect:upload";
        }

    }
}
