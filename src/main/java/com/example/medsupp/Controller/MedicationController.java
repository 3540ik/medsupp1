package com.example.medsupp.Controller;

import com.example.medsupp.Payload.MedicationDto;
import com.example.medsupp.Service.MedicationService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/medications")
public class MedicationController {
    private final MedicationService medicationService;

    public MedicationController(MedicationService medicationService) {
        this.medicationService = medicationService;
    }

    @PostMapping
    public ResponseEntity<MedicationDto> createmedication(@RequestBody MedicationDto medicationDto){
        MedicationDto savedmedications = medicationService.createMedication(medicationDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedmedications);
    }
}
