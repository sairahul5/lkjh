package com.example.namemap.service;

import com.example.namemap.entity.NameMap;
import com.example.namemap.repository.NameMapRepository;
import org.springframework.stereotype.Service;

@Service
public class NameMapService {

    private final NameMapRepository repository;

    public NameMapService(NameMapRepository repository) {
        this.repository = repository;
    }

    public NameMap saveName(String name) {
        return repository.save(new NameMap(name));
    }

    public NameMap getNameById(Long id) {
        return repository.findById(id).orElse(null);
    }
}
