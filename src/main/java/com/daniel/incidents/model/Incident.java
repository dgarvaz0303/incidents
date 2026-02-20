package com.daniel.incidents.model;

import java.time.LocalDateTime;

@Entity
public class Incident {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String description;

    private String severity;

    private String status;

    private LocalDateTime createdAt;

}
