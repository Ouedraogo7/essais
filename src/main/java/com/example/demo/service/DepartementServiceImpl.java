package com.example.demo.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Departement;
import com.example.demo.repository.DepartementRepository;

@Service
public class DepartementServiceImpl implements DepartementService {
	
	@Autowired
	private	DepartementRepository departementRepository;

	@Override
	public Departement saveDepartement(Departement departement) {
		
		return departementRepository.save(departement);
	}

	@Override
	public List<Departement> fechtDepartementList() {
		
		return departementRepository.findAll();
	}

	@Override
	public Departement fetchDepartmentById(Long departementId) {

		return departementRepository.findById(departementId).get();
	}

	@Override
	public void deleteDepartementById(Long departementId) {
		departementRepository.deleteById(departementId);
	}

	@Override
	public Departement updateDepartement(Long departementId, Departement departement) {
		
		Departement depDB = departementRepository.findById(departementId).get();
		
		if (Objects.nonNull(departement.getDepartementName())&&
			!"".equalsIgnoreCase(departement.getDepartementName())) {
			depDB.setDepartementName(departement.getDepartementName());
		}
		
		if (Objects.nonNull(departement.getDepartementCode())&&
				!"".equalsIgnoreCase(departement.getDepartementCode())) {
				depDB.setDepartementCode(departement.getDepartementCode());
			}
		if (Objects.nonNull(departement.getDepartementAdress())&&
				!"".equalsIgnoreCase(departement.getDepartementAdress())) {
				depDB.setDepartementAdress(departement.getDepartementAdress());
			}
			return departementRepository.save(depDB);
	}

	@Override
	public Departement fetchDepartementByName(String departementName) {
		// TODO Auto-generated method stub
		return departementRepository.findByDepartementName(departementName);
	}

}
