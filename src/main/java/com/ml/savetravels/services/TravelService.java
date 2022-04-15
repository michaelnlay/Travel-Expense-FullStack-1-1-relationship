package com.ml.savetravels.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.ml.savetravels.models.Travel;
import com.ml.savetravels.repositories.TravelRepository;

@Service
public class TravelService {
	
	//this is like dependency injection so we can use our travel repository
	

	// injecting the travel repository as a dependency
    private final TravelRepository travelRepo;
    
    
  //============================================================================================
  //CONSTRUCTORS================================================================================
  //============================================================================================

    public TravelService(TravelRepository travelRepo) {
		super();
		this.travelRepo = travelRepo;
	}
//============================================================================================
//METHODS================================================================================
//============================================================================================

    
  //FIND ALL Travel Expense FROM REPO
    public List<Travel>alltravels(){
    	return travelRepo.findAll();
    }
    
    
    //CREATE A Travel Expense FROM REPO =====================================================================
    public Travel createTravel(Travel travel) {
    	return travelRepo.save(travel);
    }
    

    //FIND ONE Travel Expense FROM REPO =====================================================================
    public Travel findTravel(Long id) {
    	
    	Optional<Travel>optTravel = travelRepo.findById(id);
    	
    	if(optTravel.isPresent()) {
    		return optTravel.get();
    	}else {
    		return null;
    	}
    }
    
    
    //DELETE A Travel Expense FROM REPO =====================================================================
    public void deleteTravel(Long id) {
    	travelRepo.deleteById(id);
    }
    
    
    
    //UPDATE A Travel Expense FROM REPO==========================================================================
    public Travel updateTravel(Travel travel) {
    	return travelRepo.save(travel);
    }
    
}