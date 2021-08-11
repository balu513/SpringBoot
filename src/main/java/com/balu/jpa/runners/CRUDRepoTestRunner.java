package com.balu.jpa.runners;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.balu.jpa.entity.CoronaVaccine;
import com.balu.jpa.service.ICoronaVaccineManagmentService;

@Component
public class CRUDRepoTestRunner implements CommandLineRunner {

	@Autowired
	ICoronaVaccineManagmentService service;

	@Override
	public void run(String... args) throws Exception {
//		saveVaccine();
		getAllVaccines();
		checkVaccineAvailablity();
//		registerInBatch();
		fetchVaccineById();
		fetchVaccinesByIds();
		deleteVaccineById();
		getVaccineCount();
		removeVaccineByObject();

	}

	private void registerInBatch() {
		List<CoronaVaccine> lsitVaccines = Arrays.asList(new CoronaVaccine("SPUTHNIK", "Russina Company", "Russya", 700.00D, 2),
				new CoronaVaccine("CoviShield", "Pfyser", "INDIA", 750.00D, 2));
		service.registerInBatch(lsitVaccines);
		
	}

	private void checkVaccineAvailablity() {
		boolean availible = service.checkVaccineAvailablityByRegNo(2);
		String res= availible == true? " Vaccine Available" : " Vaccine Not Available"; 
		System.out.println("---->> "+res);
	}

	private void getAllVaccines() {
		service.getAllVaccines().forEach(vaccine ->{
			System.out.println("Vaccine:  "+vaccine.toString());
		});
		
	}

	private void saveVaccine() {
		String registerVaccineMsg = service.registerVaccine(new CoronaVaccine("COVAXIN", "BHARATH BIO", "INDIA", 1200.00D, 2));
		System.out.println(registerVaccineMsg);
	}
	
	private void fetchVaccineById() {
		System.out.println("---------------- -------  ----------fetchVaccineById ----- ----------- ---------------");
		Optional<CoronaVaccine> obj = service.fetchVaccineById(7L);
		 CoronaVaccine vaccine = obj.get();
		 System.out.println(vaccine.toString());
		
	}
	
	private void fetchVaccinesByIds() {
		System.out.println("---------------- -------  ----------fetchVaccinesByIds ----- ----------- ---------------");
		service.findAllVacccinesByIDs(List.of(8L,5L,3L)).forEach(
				vaccine -> System.out.println(vaccine.toString())
				);
		
	}
	private void deleteVaccineById() {
		System.out.println("---------------- -------  ----------deleteVaccineByID ----- ----------- ---------------");
//		service.removeVaccineById(2L);
		
	}
	
	private void getVaccineCount() {
		System.out.println("---------------- -------  ----------deleteVaccineByID ----- ----------- ---------------");
		System.out.println("count -->   "+service.getVaccineCount());	
	}
	
	private void removeVaccineByObject() {
		System.out.println("---------------- -------  ----------removeVaccineByObject ----- ----------- ---------------");
//		CoronaVaccine vaccine = new CoronaVaccine(1L,"BHARATH BIO1", "INDIA1", "COVAXIN1", 1201D, 1);
		CoronaVaccine vaccine = new CoronaVaccine();
		vaccine.setRegNo(1L);
//		service.removeVaccineByObject(vaccine);
		
	}

}
