package org.example.gestionrh.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class AbsenceDTO {
    private Long id;
    private Long employeeId;
    private LocalDate startDate;
    private LocalDate endDate;
    private String type;
    private String reason;
}