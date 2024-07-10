package org.example.gestionrh.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class CandidateDTO {
    private Long id;
    private String name;
    private String identificationNumber;
    private String address;
    private String phone;
    private String email;
    private LocalDate birthDate;
    private int rating;
    private String observation;
    private String skill;
    private String technicalArea;
    private LocalDate jobInterviewDate;
}
