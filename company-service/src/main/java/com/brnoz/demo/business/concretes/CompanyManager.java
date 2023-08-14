package com.brnoz.demo.business.concretes;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.brnoz.demo.business.abstracts.CompanyService;
import com.brnoz.demo.business.constants.Messages;
import com.brnoz.demo.business.dto.requests.CreateCompanyRequest;
import com.brnoz.demo.business.dto.requests.UpdateCompanyRequest;
import com.brnoz.demo.business.dto.responses.create.CreateCompanyResponse;
import com.brnoz.demo.business.dto.responses.get.GetAllCompanyResponse;
import com.brnoz.demo.business.dto.responses.get.GetByCompanyResponse;
import com.brnoz.demo.business.dto.responses.update.UpdateCompanyResponse;
import com.brnoz.demo.business.rules.CompanyRules;
import com.brnoz.demo.dataAccess.CompanyRepository;
import com.brnoz.demo.entities.Company;
import com.brnoz.demo.utilities.mapping.ModelMapperService;
import com.brnoz.demo.utilities.results.DataResult;
import com.brnoz.demo.utilities.results.Result;
import com.brnoz.demo.utilities.results.SuccessDataResult;
import com.brnoz.demo.utilities.results.SuccessResult;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CompanyManager implements CompanyService {

	private final ModelMapperService mapperService;
	private final CompanyRepository repository;
	private final CompanyRules rules;

	@Override
	public DataResult<CreateCompanyResponse> add(CreateCompanyRequest request) {
		Company company = this.mapperService.forRequest().map(request, Company.class);
		this.repository.save(company);
		CreateCompanyResponse response = this.mapperService.forResponse().map(company, CreateCompanyResponse.class);
		return new SuccessDataResult<CreateCompanyResponse>(response, Messages.CreatedCompany);
	}

	@Override
	public DataResult<UpdateCompanyResponse> update(UpdateCompanyRequest request) {
		this.rules.checkIfExistByCompanyId(request.getId());
		Company company = this.mapperService.forRequest().map(request, Company.class);
		this.repository.save(company);
		UpdateCompanyResponse response = this.mapperService.forResponse().map(company, UpdateCompanyResponse.class);
		return new SuccessDataResult<UpdateCompanyResponse>(response, Messages.CompanyUpdated);
	}

	@Override
	public DataResult<List<GetAllCompanyResponse>> getAll() {
		List<Company> companies = this.repository.findAll();
		List<GetAllCompanyResponse> responses = companies.stream()
				.map(company -> this.mapperService.forResponse().map(company, GetAllCompanyResponse.class))
				.collect(Collectors.toList());
		return new SuccessDataResult<List<GetAllCompanyResponse>>(responses, Messages.ListedCompany);
	}

	@Override
	public DataResult<GetByCompanyResponse> getByCompany(UUID id) {
		this.rules.checkIfExistByCompanyId(id);
		Company company = this.repository.findById(id).get();
		GetByCompanyResponse response = this.mapperService.forResponse().map(company, GetByCompanyResponse.class);
		return new SuccessDataResult<GetByCompanyResponse>(response,Messages.ListedCompany);
	}

	@Override
	public Result delete(UUID id) {
		this.rules.checkIfExistByCompanyId(id);
		this.repository.deleteById(id);
	
		return new SuccessResult(Messages.DeletedCompany);
	}
}
