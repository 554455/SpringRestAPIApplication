package com.umaraliev.springresertapiapplication.service;

import com.umaraliev.springresertapiapplication.model.File;
import com.umaraliev.springresertapiapplication.repository.FileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FileService {

    private final FileRepository fileRepository;

    @Autowired
    public FileService(FileRepository fileRepository) {
        this.fileRepository = fileRepository;
    }

    public File getById(Long id) {
        return fileRepository.getById(id);
    }

    public List<File> getAll() {
        return fileRepository.findAll();
    }

    public File save(File file) {
        return fileRepository.save(file);
    }

    public void delete(Long id) {
        fileRepository.deleteById(id);
    }
}
