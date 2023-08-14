package com.brnoz.demo.api.controllers;

import java.util.List;
import java.util.UUID;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.brnoz.demo.business.abstracts.CompanyService;
import com.brnoz.demo.business.dto.requests.CreateCompanyRequest;
import com.brnoz.demo.business.dto.requests.UpdateCompanyRequest;
import com.brnoz.demo.business.dto.responses.create.CreateCompanyResponse;
import com.brnoz.demo.business.dto.responses.get.GetAllCompanyResponse;
import com.brnoz.demo.business.dto.responses.get.GetByCompanyResponse;
import com.brnoz.demo.business.dto.responses.update.UpdateCompanyResponse;
import com.brnoz.demo.utilities.results.DataResult;
import com.brnoz.demo.utilities.results.Result;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;

@RestController("api/companies")
@RequestMapping
@AllArgsConstructor
public class CompanyController {

	private CompanyService service;

	@PostMapping
	public DataResult<CreateCompanyResponse> add(@RequestBody @Valid CreateCompanyRequest request) {
		return this.service.add(request);
	}

	@PutMapping
	public DataResult<UpdateCompanyResponse> update(@RequestBody @Valid UpdateCompanyRequest request) {
		return this.service.update(request);
	}

	@GetMapping
	public DataResult<List<GetAllCompanyResponse>> getAll() {
		return this.service.getAll();
	}

	@GetMapping("/{id}")
	public DataResult<GetByCompanyResponse> getByCompany(@PathVariable UUID id) {
		return this.service.getByCompany(id);
	}

	@DeleteMapping("/{id}")
	public Result delete(@PathVariable UUID id) {
		return this.service.delete(id);
	}
}
