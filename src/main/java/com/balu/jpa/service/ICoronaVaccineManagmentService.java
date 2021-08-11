package com.balu.jpa.service;

import java.util.Optional;

import com.balu.jpa.entity.CoronaVaccine;

public interface ICoronaVaccineManagmentService {
	
	public String registerVaccine(CoronaVaccine vaccine);
	
	public Iterable<CoronaVaccine> getAllVaccines();
	
	public boolean checkVaccineAvailablityByRegNo(long regNo);
	
	public Iterable<CoronaVaccine> registerInBatch(Iterable<CoronaVaccine> vaccines);
	
	public Optional<CoronaVaccine> fetchVaccineById(Long id);
	
	public Iterable<CoronaVaccine> findAllVacccinesByIDs(Iterable<Long> ids);
	
	public void removeVaccineById(Long id);
	
	public long getVaccineCount();
	
	public void removeVaccineByObject(CoronaVaccine vaccine);

}
