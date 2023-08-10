package com.brnoz.demo.configurations.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ModelMapperConfiguration {
	@Bean
	public ModelMapper getModelMapper() {
		return new ModelMapper();
	}
}
