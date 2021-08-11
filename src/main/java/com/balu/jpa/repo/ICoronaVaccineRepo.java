package com.balu.jpa.repo;

import org.springframework.data.repository.CrudRepository;

import com.balu.jpa.entity.CoronaVaccine;

public interface ICoronaVaccineRepo extends CrudRepository<CoronaVaccine, Long> {

}
