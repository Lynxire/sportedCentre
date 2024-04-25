package by.teachmeskills.controller;

import lombok.RequiredArgsConstructor;
import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;

@RestController
@RequestMapping("file")
public class FileController {
    @PostMapping("/save")
    public void saveFile(@RequestParam("file") MultipartFile file) {
        try {
            byte[] bytes = file.getBytes();
            BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream
                    (new File("D:\\test\\test1.txt")));
            stream.write(bytes);
            stream.close();
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    //online кодировщик в формат doc
    @GetMapping("/get")
    public String getFile() {
        try {
            BufferedInputStream stream =
                    new BufferedInputStream(new FileInputStream(new File("D:\\test\\test1.txt")));
            byte[] bytes = stream.readAllBytes();
            stream.close();
            String result = Base64.encodeBase64String(bytes);
            return result;
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
