package com.example.medsupp.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table
public class Medication {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long MedicationId;
    private String MedicationName;
    private String Description;
    private String ManufacturedBy;
    private String DosageType;
    private Double UnitePrice;
    private LocalDate ExpirationDate;
}
