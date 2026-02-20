package com.example.incidents.service;

import com.example.incidents.model.Incident;
import com.example.incidents.repository.IncidentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class IncidentService {

    private final IncidentRepository repository;

    public Incident createIncident(Incident incident) {
        incident.setCreatedAt(LocalDateTime.now());
        incident.setStatus("OPEN");
        return repository.save(incident);
    }

    public List<Incident> getAll() {
        return repository.findAll();
    }
}