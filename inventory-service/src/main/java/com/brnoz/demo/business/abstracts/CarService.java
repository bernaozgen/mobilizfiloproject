package com.brnoz.demo.business.abstracts;

import java.util.List;
import java.util.UUID;

import com.brnoz.demo.business.dto.requests.created.CreateCarRequest;
import com.brnoz.demo.business.dto.requests.updated.UpdateCarRequest;
import com.brnoz.demo.business.dto.responses.created.CreateCarResponse;
import com.brnoz.demo.business.dto.responses.get.GetAllCarResponse;
import com.brnoz.demo.business.dto.responses.get.GetByCarResponse;
import com.brnoz.demo.business.dto.responses.updated.UpdateCarResponse;
import com.brnoz.demo.utilities.results.DataResult;
import com.brnoz.demo.utilities.results.Result;

public interface CarService {

	DataResult<CreateCarResponse> add(CreateCarRequest request);

	DataResult<UpdateCarResponse> update(UpdateCarRequest request);

	DataResult<List<GetAllCarResponse>> getAll();

	DataResult<GetByCarResponse> getByCar(String plateNumber);

	Result delete(UUID id);
}
