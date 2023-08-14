package com.brnoz.demo.business.dto.responses.update;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateCompanyResponse {

	private UUID id;
	private String companyName;
}
