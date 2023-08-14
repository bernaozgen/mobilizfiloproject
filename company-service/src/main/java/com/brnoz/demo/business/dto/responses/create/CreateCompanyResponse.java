package com.brnoz.demo.business.dto.responses.create;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateCompanyResponse {

	private UUID id;
	private String companyName;
}
