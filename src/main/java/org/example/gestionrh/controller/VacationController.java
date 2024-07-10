package org.example.gestionrh.controller;

import  org.example.gestionrh.dto.VacationDTO;
import  org.example.gestionrh.service.VacationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/vacations")
public class VacationController {

    @Autowired
    private VacationService vacationService;

    @GetMapping
    public List<VacationDTO> getAllVacations() {
        return vacationService.getAllVacations();
    }

    @GetMapping("/{id}")
    public VacationDTO getVacationById(@PathVariable Long id) {
        return vacationService.getVacationById(id);
    }

    @PostMapping
    public VacationDTO createVacation(@RequestBody VacationDTO vacationDTO) {
        return vacationService.createVacation(vacationDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteVacation(@PathVariable Long id) {
        vacationService.deleteVacation(id);
    }
}
