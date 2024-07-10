package org.example.gestionrh.controller;

import org.example.gestionrh.dto.AbsenceDTO;
import org.example.gestionrh.service.AbsenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/absences")
public class AbsenceController {

    @Autowired
    private AbsenceService absenceService;

    @GetMapping
    public List<AbsenceDTO> getAllAbsences() {
        return absenceService.getAllAbsences();
    }

    @GetMapping("/{id}")
    public AbsenceDTO getAbsenceById(@PathVariable Long id) {
        return absenceService.getAbsenceById(id);
    }

    @PostMapping
    public AbsenceDTO createAbsence(@RequestBody AbsenceDTO absenceDTO) {
        return absenceService.createAbsence(absenceDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteAbsence(@PathVariable Long id) {
        absenceService.deleteAbsence(id);
    }
}
