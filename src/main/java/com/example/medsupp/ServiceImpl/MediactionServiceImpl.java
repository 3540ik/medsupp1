package com.example.medsupp.ServiceImpl;

import com.example.medsupp.Entity.Medication;
import com.example.medsupp.Payload.MedicationDto;
import com.example.medsupp.Repository.MedicationRepository;
import com.example.medsupp.Service.MedicationService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class MediactionServiceImpl implements MedicationService {

    private final MedicationRepository medicationRepository;
    private final ModelMapper modelMapper;

    public MediactionServiceImpl(MedicationRepository medicationRepository, ModelMapper modelMapper) {
        this.medicationRepository = medicationRepository;
        this.modelMapper = modelMapper;
    }


    @Override
    public MedicationDto createMedication(MedicationDto medicationDto) {
        Medication medications = modelMapper.map(medicationDto, Medication.class);
        Medication savedmedications = medicationRepository.save(medications);

        return modelMapper.map(savedmedications, MedicationDto.class);
    }
}
