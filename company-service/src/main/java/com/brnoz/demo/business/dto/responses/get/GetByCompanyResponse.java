package com.brnoz.demo.business.dto.responses.get;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetByCompanyResponse {
	private UUID id;
	private String companyName;
}
