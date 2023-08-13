package com.brnoz.demo.business.dto.responses.get;

import java.time.LocalDate;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetByCarResponse {

	private UUID id;

	private String plateNumber;

	private String model;

	private LocalDate modelYear;

	private String brand;

	private String chassisNumber;

	private String label;
}
