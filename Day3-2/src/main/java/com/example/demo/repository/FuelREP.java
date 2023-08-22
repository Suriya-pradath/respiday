package com.example.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
public interface FuelREP {
	
public interface fuelRep extends JpaRepository<PetrolBunk,Integer> {

	}
}
