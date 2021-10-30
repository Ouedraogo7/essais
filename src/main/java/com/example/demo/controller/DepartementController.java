package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Departement;
import com.example.demo.service.DepartementService;

@RestController
public class DepartementController {
	
	
	@Autowired
	private DepartementService departementService;
	
	@PostMapping("/dept")
	public Departement saveDepartement( @RequestBody Departement departement) {
		return departementService.saveDepartement(departement);
	}
	@GetMapping("/dept")
	public List<Departement> fechtDepartementList(){
		return departementService.fechtDepartementList(); 
	}
	
	@GetMapping("/dept/{id}")
	public Departement fetchDepartmentById( @PathVariable("id")Long departementId) {
		return departementService.fetchDepartmentById(departementId);
	}
	@DeleteMapping("/dept/{id}")
public String deleteDepartementById(@PathVariable ("id") Long departementId) {
	departementService.deleteDepartementById(departementId);
	return "departement supprumer avec success";
	
}
	
	@PutMapping("/dept/{id}")
	public Departement updateDepartement( @PathVariable("id") Long departementId,
										@RequestBody Departement departement	) {
			
		return departementService.updateDepartement(departementId,departement);
				
	}

	@GetMapping("/dept/name/{name}")
	
	public Departement fetchDepartementByName(@PathVariable("name") String departementName) {
		return departementService.fetchDepartementByName(departementName);
	}
}
