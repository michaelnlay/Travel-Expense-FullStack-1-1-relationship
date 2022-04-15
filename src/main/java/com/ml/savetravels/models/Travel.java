package com.ml.savetravels.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

//this entity and at table name savetravels is to tell compilier that we will build a table in mysql call travels
@Entity
@Table(name="travels")
public class Travel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotNull
    @Size(min = 3, max = 30, message="The name must be no less than 3, and not over 30!")
    private String expense;
    
    @NotNull
    @Size(min = 3, max = 15, message="vendor can't be empty!")
    private String vendor;
    
    
    @NotNull
    @Min(value=1, message="Must be higher than 0!")
    @Max(value=100, message="Must be less than 100!")
    private Double amount ;
    
    
    // This will not allow the createdAt column to be updated after creation
    @Column(updatable=false)
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date createdAt;
    
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date updatedAt;

//============================================================================================
//CONSTRUCTORS================================================================================
//============================================================================================
    
    public Travel() {
    	super();
    }
    


public Travel(Long id,
		@NotNull @Size(min = 3, max = 30, message = "The name must be no less than 3, and not over 30!") String expense,
		@NotNull @Size(min = 3, max = 15, message = "vendor can't be empty!") String vendor,
		@NotNull @Min(value = 1, message = "Must be higher than 0!") @Max(value = 100, message = "Must be less than 100!") Double amount,
		Date createdAt, Date updatedAt) {
	super();
	this.id = id;
	this.expense = expense;
	this.vendor = vendor;
	this.amount = amount;
	this.createdAt = createdAt;
	this.updatedAt = updatedAt;
}








//============================================================================================
	//GETTER & SETTERS===============================================================================================
  //============================================================================================

  
public void setExpense(String expense) {
	this.expense = expense;
}



public String getVendor() {
	return vendor;
}



public void setVendor(String vendor) {
	this.vendor = vendor;
}



public Double getAmount() {
	return amount;
}



public void setAmount(Double amount) {
	this.amount = amount;
}



public Date getCreatedAt() {
	return createdAt;
}



public void setCreatedAt(Date createdAt) {
	this.createdAt = createdAt;
}



public Date getUpdatedAt() {
	return updatedAt;
}



public void setUpdatedAt(Date updatedAt) {
	this.updatedAt = updatedAt;
}



public void setId(Long id) {
	this.id = id;
}



public Long getId() {
	return id;
}
	
	//==============================================================
	 @PrePersist
	    protected void onCreate(){
	        this.createdAt = new Date();
	    }
		public String getExpense() {
		return expense;
	}







		@PreUpdate
	    protected void onUpdate(){
	        this.updatedAt = new Date();
	    }
	
}
    
    
    