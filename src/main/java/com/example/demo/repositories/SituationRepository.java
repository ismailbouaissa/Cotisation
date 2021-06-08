package com.example.demo.repositories;






import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Situation;



@Repository
public interface SituationRepository extends JpaRepository<Situation, Long> {
	
   


	
}