package com.balu.jpa.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
public class CoronaVaccine implements Serializable{
	
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long regNo;
	
	@NonNull
	@Column(length = 20)
	private String name;
	
	@NonNull
	@Column(length = 20)
	private String company;
	
	public Long getRegNo() {
		return regNo;
	}

	public void setRegNo(Long regNo) {
		this.regNo = regNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getNoOfDosesRequired() {
		return noOfDosesRequired;
	}

	public void setNoOfDosesRequired(Integer noOfDosesRequired) {
		this.noOfDosesRequired = noOfDosesRequired;
	}

	@NonNull
	@Column(length = 20)
	private String country;
	
	@NonNull
	private Double price;
	
	@NonNull
	private Integer noOfDosesRequired;
	
	
	
	public CoronaVaccine(Long regNo, @NonNull String name, @NonNull String company, @NonNull String country,
			@NonNull Double price, @NonNull Integer noOfDosesRequired) {
		super();
		this.regNo = regNo;
		this.name = name;
		this.company = company;
		this.country = country;
		this.price = price;
		this.noOfDosesRequired = noOfDosesRequired;
	}

	public CoronaVaccine(String name, String company, String country, Double price, Integer noOfDosesRequired) {
		this.name = name;
		this.company = company;
		this.country = country;
		this.price = price;
		this.noOfDosesRequired = noOfDosesRequired;
	}
	
	public CoronaVaccine() {
		
	}

	@Override
	public String toString() {
		return "CoronaVaccine [regNo=" + regNo + ", name=" + name + ", company=" + company + ", country=" + country
				+ ", price=" + price + ", noOfDosesRequired=" + noOfDosesRequired + "]";
	}
	
	

}
