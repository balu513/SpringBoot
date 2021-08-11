package com.balu.jpa.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.balu.jpa.entity.CoronaVaccine;
import com.balu.jpa.repo.ICoronaVaccineRepo;

@Service("vaccineMgmtService")
public class CoronaVaccineManagementServiceImpl implements ICoronaVaccineManagmentService {
	
	@Autowired
	ICoronaVaccineRepo repo;

	@Override
	public String registerVaccine(CoronaVaccine vaccine) {
		CoronaVaccine savedVaccine = repo.save(vaccine);
		return savedVaccine != null ? "Vaccine saved successful.":" Vaccine Saving Failed.";
	}

	@Override
	public Iterable<CoronaVaccine> getAllVaccines() {
		return repo.findAll();
	}

	@Override
	public boolean checkVaccineAvailablityByRegNo(long regNo) {
		return repo.existsById(regNo);
	}

	@Override
	public Iterable<CoronaVaccine> registerInBatch(Iterable<CoronaVaccine> vaccines) {
		return repo.saveAll(vaccines);
	
	}

	@Override
	public Optional<CoronaVaccine> fetchVaccineById(Long id) {
		return repo.findById(id);
	}

	@Override
	public Iterable<CoronaVaccine> findAllVacccinesByIDs(Iterable<Long> ids) {
		return repo.findAllById(ids);
	}

	@Override
	public void removeVaccineById(Long id) {
		repo.deleteById(2L);
	}

	@Override
	public long getVaccineCount() {
		return repo.count();
	}

	@Override
	public void removeVaccineByObject(CoronaVaccine vaccine) {
		Optional<CoronaVaccine> vaccineObj = repo.findById(vaccine.getRegNo());
		repo.delete(vaccineObj.get());
	}

}
