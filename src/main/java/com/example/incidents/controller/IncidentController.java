package com.example.incidents.controller;

import com.example.incidents.model.Incident;
import com.example.incidents.service.IncidentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
@CrossOrigin(origins = "#")
public class IncidentController {

    private final IncidentService service;

    @GetMapping("/incidents")
    public List<Incident> getAll() {
        return service.getAll();
    }

    @GetMapping("/ping")
    public String ping() {
        return "pong";
    }

    @PostMapping("/incidents")
    public Incident create(@RequestBody Incident incident) {
        return service.createIncident(incident);
    }
}