package com.example.demo.service;

import java.util.List;

import com.example.demo.entities.Departement;

public interface DepartementService {

	public Departement saveDepartement(Departement departement);

	public List<Departement> fechtDepartementList();

	public Departement fetchDepartmentById(Long departementId) ;

	public void deleteDepartementById(Long departementId);

	public Departement updateDepartement(Long departementId, Departement departement);

	public Departement fetchDepartementByName(String departementName);

}
