package org.example.gestionrh.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class VacationDTO {
    private Long id;
    private LocalDate startDate;
    private LocalDate endDate;
    private String type;
    private String reason;
}