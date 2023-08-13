package com.brnoz.demo.business.dto.responses.updated;

import java.time.LocalDate;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateCarResponse {

	private UUID id;

	private String plateNumber;

	private String model;

	private LocalDate modelYear;

	private String brand;

	private String chassisNumber;

	private String label;
}
