package com.example.demo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;*/

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Departement {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private Long departementId;
	
	private String departementName;
	private String departementAdress;
	private String departementCode;
	
	
	
	
}
