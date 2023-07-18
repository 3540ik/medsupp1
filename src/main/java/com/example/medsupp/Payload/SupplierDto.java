package com.example.medsupp.Payload;

import lombok.Data;

@Data
public class SupplierDto {
    private Long SupplierId;
    private String SupplierName;
    private String SupplierContactNumber;
    private String SupplierContactPerson;
    private String SupplierEmail;
}
