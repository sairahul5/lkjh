package com.example.namemap.controller;

import com.example.namemap.entity.NameMap;
import com.example.namemap.service.NameMapService;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/map")
@CrossOrigin(origins = "*") // Allow Vercel frontend to access
public class NameMapController {

    private final NameMapService service;

    public NameMapController(NameMapService service) {
        this.service = service;
    }

    // POST /api/map -> Create map
    @PostMapping
    public NameMap createMap(@RequestBody Map<String, String> payload) {
        return service.saveName(payload.get("name"));
    }

    // GET /api/map/{id} -> Get name
    @GetMapping("/{id}")
    public NameMap getMap(@PathVariable Long id) {
        return service.getNameById(id);
    }
}
