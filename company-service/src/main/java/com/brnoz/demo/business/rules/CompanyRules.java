package com.brnoz.demo.business.rules;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.brnoz.demo.business.constants.Messages;
import com.brnoz.demo.dataAccess.CompanyRepository;
import com.brnoz.demo.utilities.exceptions.BusinessException;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class CompanyRules {
	
	private final CompanyRepository repository;
	
	public void checkIfExistByCompanyId(UUID id) {
		if (this.repository.findById(id).get() == null) {
			throw new BusinessException(Messages.CompanyIdNotFound);
		}
	}

}
