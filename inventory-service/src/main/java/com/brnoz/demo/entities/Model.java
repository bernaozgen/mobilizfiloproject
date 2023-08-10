package com.brnoz.demo.entities;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "models")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Model {

	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private UUID id;

	@Column(name = "modelName")
	private String model;

	@Column(name = "modelYears")
	private LocalDate modelYears;

	@ManyToOne
	@JoinColumn(name = "brandId")
	private Brand brand;

	@OneToMany(mappedBy = "model" ,fetch = FetchType.EAGER)
	private List<Car> cars;

}
