package com.brnoz.demo.business.abstracts;

import java.util.List;
import java.util.UUID;

import com.brnoz.demo.business.dto.requests.CreateCompanyRequest;
import com.brnoz.demo.business.dto.requests.UpdateCompanyRequest;
import com.brnoz.demo.business.dto.responses.create.CreateCompanyResponse;
import com.brnoz.demo.business.dto.responses.get.GetAllCompanyResponse;
import com.brnoz.demo.business.dto.responses.get.GetByCompanyResponse;
import com.brnoz.demo.business.dto.responses.update.UpdateCompanyResponse;
import com.brnoz.demo.utilities.results.DataResult;
import com.brnoz.demo.utilities.results.Result;

public interface CompanyService {

	DataResult<CreateCompanyResponse> add(CreateCompanyRequest request);

	DataResult<UpdateCompanyResponse> update(UpdateCompanyRequest request);

	DataResult<List<GetAllCompanyResponse>> getAll();

	DataResult<GetByCompanyResponse> getByCompany(UUID id);

	Result delete(UUID id);
}
