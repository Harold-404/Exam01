package com.javasec.exam01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

@Controller
public class Download {

    @RequestMapping
    public String downloadPage() {
        return "download";
    }

    @GetMapping("/download")
    public String download(String filename, HttpServletRequest request, HttpServletResponse response, Model model) {
        // 下载的文件路径
        String filePath = System.getProperty("user.dir") + "/src/main/resources/static/file/" + filename;
        System.out.println("[*] 文件目录: " + filePath);

        // 使用流的形式下载文件
        try {
            // 加载文件
            File file = new File(filePath);
            InputStream fis = new BufferedInputStream(new FileInputStream(file));
            byte[] buffer = new byte[fis.available()];
            fis.read(buffer);
            fis.close();

            // 设置response的Header
            response.reset();
            response.addHeader("Content-Disposition", "attachment;filename=" + filename);
            response.addHeader("Content-Length", "" + file.length());
            OutputStream toClient = new BufferedOutputStream(response.getOutputStream());
            response.setContentType("application/octet-stream");
            toClient.write(buffer);
            toClient.flush();
            toClient.close();
            model.addAttribute("message", "下载文件成功：" + filePath + "");
            return "download";
        } catch (Exception e) {
            e.printStackTrace();
            model.addAttribute("message", "未找到文件：" + filePath + "");
            return "download";
        }
    }
}