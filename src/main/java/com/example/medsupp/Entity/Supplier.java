package com.example.medsupp.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table
public class Supplier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long SuppierId;
    private String SupplierName;
    private String SupplierContactNumber;
    private String SupplierContactPerson;
    private String SupplierEmail;
}
