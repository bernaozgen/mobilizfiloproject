package com.brnoz.demo.business.rules;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.brnoz.demo.business.constants.Messages;
import com.brnoz.demo.dataAccess.CarRepository;
import com.brnoz.demo.utilities.exceptions.BusinessException;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class CarRules {
	private CarRepository carRepository;

	public void checkIfExistByCarId(UUID id) {
		if (this.carRepository.findById(id).get() == null) {
			throw new BusinessException(Messages.CarIdNotFound);
		}
	}

	public void checkIfExistByPlateNumber(String plateNumber) {
		if (this.carRepository.findByPlateNumber(plateNumber) == null) {
			throw new BusinessException(Messages.PlateNumberNotFound);
		}
	}

}
