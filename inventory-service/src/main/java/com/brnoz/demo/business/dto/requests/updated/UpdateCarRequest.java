package com.brnoz.demo.business.dto.requests.updated;

import java.time.LocalDate;
import java.util.UUID;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateCarRequest {

	@NotNull
	private UUID id;
	@NotNull
	@NotEmpty
	private String plateNumber;
	@NotEmpty
	@NotNull
	private String model;
	
	@NotNull
	private LocalDate modelYear;
	@NotEmpty
	@NotNull
	private String brand;

	private String chassisNumber;

	private String label;

}
