package com.example.demo.service;

import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.model.PetrolBunk;
import com.example.demo.repository.FuelREP.fuelRep;

@Service
public class FuelService {

	
		@Autowired
		fuelRep frepo;
		
		public PetrolBunk saveDetails(PetrolBunk p)
		{
			return frepo.save(p);
		}
		
		public List<PetrolBunk> getDetails()
		{
			return frepo.findAll();
		}
	}


