package com.ml.fullcrud.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.ml.fullcrud.models.Candy;
import com.ml.fullcrud.repositories.CandyRepository;

@Service
public class CandyService {
	
	//this is like dependency injection so we can use our candy repository
	

	// injecting the candy repository as a dependency
    private final CandyRepository candyRepo;
    
    
    //CONSTRUCTOR===============================================
    
    public CandyService(CandyRepository candyRepo) {
		super();
		this.candyRepo = candyRepo;
	}


    
    //FIND ALL CANDY FROM REPO
    public List<Candy>allCandys(){
    	return candyRepo.findAll();
    }
    
    
    //CREATE A CANDY FROM REPO
    public Candy createCandy(Candy candy) {
    	return candyRepo.save(candy);
    }
    
    
    
    //FIND ONE CANDY FROM REPO
    public Candy findCandy(Long id) {
    	Optional<Candy> optCandy = candyRepo.findById(id);
    	if(optCandy.isPresent()) {
    		return optCandy.get();
    		
    	}else {
    			return null;
    		}
    	}
    
    
    
    
    //DELETE A CANDY FROM REPO
    public void candyMan(Long id) {
    	candyRepo.deleteById(id);
    	
    }
    
    
    //UPDATE A CANDY FROM REPO
    public Candy updateCandy(Candy candy) {
    	return candyRepo.save(candy);
    }
    
}