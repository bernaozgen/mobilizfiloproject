package com.brnoz.demo.dataAccess;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brnoz.demo.entities.Company;

public interface CompanyRepository extends JpaRepository<Company, UUID> {

}
