package com.controllor;

import org.springframework.core.io.InputStreamResource;
import org.springframework.core.io.InputStreamSource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URLConnection;
import java.net.URLEncoder;

@Controller
public class FillLoad {
    public static final String FILE_DIRECTORY = "E:/";

    @PostMapping("/load")
    public String load(MultipartFile fileName){
        if (fileName == null){
            System.out.println("上传有误，请重新上传！");
            return "index";
        }else {
            String url = "E:/";
            String name = fileName.getOriginalFilename();
            String path = url + File.separator + name;
            File file = new File(path);
            try {
                fileName.transferTo(file);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return "sussess";
    }

    @RequestMapping("/download")
    public ResponseEntity<InputStreamSource> download(String fileName) throws IOException {
        String path = FILE_DIRECTORY + File.separator + fileName;
        File file = new File(path);

        String type = URLConnection.guessContentTypeFromName(fileName);
        if (type == null){
            type = MediaType.APPLICATION_OCTET_STREAM_VALUE;
        }
        System.out.println("头部类型："+type);
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.parseMediaType(type));

        httpHeaders.setContentDispositionFormData("attachment", URLEncoder.encode(fileName,"UTF-8"));
        InputStreamResource inputStreamResource = new InputStreamResource(new FileInputStream(file));
        return  new ResponseEntity<>(inputStreamResource,httpHeaders, HttpStatus.OK);

    }
}
