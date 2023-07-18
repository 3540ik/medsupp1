package com.example.medsupp.Repository;

import com.example.medsupp.Entity.Medication;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicationRepository extends JpaRepository<Medication, Long> {
}
