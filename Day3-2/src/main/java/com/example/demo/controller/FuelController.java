package com.example.demo.controller;

import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.PetrolBunk;
import com.example.demo.service.FuelService;

@RestController
public class FuelController {
	

		
		@Autowired
		FuelService fser;
		@PostMapping("/saveFuel")
		
		public PetrolBunk saveFuelStationDe(@RequestBody PetrolBunk pb)
		{
			return fser.saveDetails(pb);
		}
		
		@GetMapping("/getFuel")
		public List<PetrolBunk> getFuelStationDe()
		{
			return fser.getDetails();
		}
	}

