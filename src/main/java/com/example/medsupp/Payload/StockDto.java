package com.example.medsupp.Payload;

import lombok.Data;

@Data
public class StockDto {

private Long StockId;
private Long MedicationId;
private int CurrentStockQuantity;
private int ReOrderLevel;
private Long SupplierId;

}
