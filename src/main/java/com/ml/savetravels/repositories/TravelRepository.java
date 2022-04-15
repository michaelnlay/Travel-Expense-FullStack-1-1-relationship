package com.ml.savetravels.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ml.savetravels.models.Travel;


@Repository
//Repository take interface file that hold default methods for us to use in other classes
public interface TravelRepository extends CrudRepository<Travel, Long> {
	
    // this method retrieves all the travel expenses from the database
    List<Travel> findAll();
    

}
