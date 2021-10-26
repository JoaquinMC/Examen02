package com.examen.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.examen.model.Buses;

@Repository
public interface IBusesRepository extends JpaRepository<Buses,Integer>{
	
	//Aqui esta el crud :3

}
