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
public class Stock {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long StockId;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Medication_Id")
    private Medication medication;
    private int CurrentStockQuantity;
    private int ReOrderLevel;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Supplier_Id")
    private Supplier supplier;
}
