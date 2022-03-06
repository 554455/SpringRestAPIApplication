package com.umaraliev.springresertapiapplication.controllers;

import com.umaraliev.springresertapiapplication.model.File;
import com.umaraliev.springresertapiapplication.service.FileService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/file")
public class FileController {

    private final FileService fileService;

    public FileController(FileService fileService) {
        this.fileService = fileService;
    }

    @RequestMapping("/list")
    public List<File> getAll() {
        return fileService.getAll();
    }

    @RequestMapping("/{id}")
    public File getById(@PathVariable("id") Long id) {
        return fileService.getById(id);
    }

    @PostMapping("/create-file")
    public File save(@RequestBody File file) {
        fileService.save(file);
        return file;
    }

    @DeleteMapping("/delete-file/{id}")
    public void delete(@PathVariable Long id) {
        fileService.getById(id);
    }
}
