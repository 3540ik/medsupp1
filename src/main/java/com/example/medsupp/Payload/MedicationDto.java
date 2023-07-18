package com.example.medsupp.Payload;

import lombok.Data;

import java.time.LocalDate;

@Data
public class MedicationDto {

    private Long MedicationId;
    private String MedicationName;
    private String Description;
    private String ManufacturedBy;
    private String DosageType;
    private Double UnitePrice;
    private LocalDate ExpirationDate;
}
