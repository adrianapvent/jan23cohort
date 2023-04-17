/**
 * 
 */
package com.codingdojo.burgertracker.models;

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
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

/**
 * @author Adriana.Pena
 *
 */
@Entity
@Table(name="burgers")
public class Burger {
    // ==========================
    //        ATTRIBUTES
    // ==========================
	// create unique id
    @Id		
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    // burger name
    @NotBlank
    private String burgerName;
    
    //restaurant name
    @NotBlank
    private String restaurant;
    
    @NotNull
    @Min(1)
    @Max(5)
    private Integer rating;
    
    @NotBlank
    private String notes;

    // This will not allow the createdAt column to be updated after creation
    @Column(updatable=false)
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date createdAt;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date updatedAt;

// ==========================
//        CONSTRUCTOR
// ==========================
    //empty constructor needed
    public Burger(){}
    
    
    public Burger(@NotBlank String burgerName, @NotBlank String restaurant, @NotNull @Min(1) @Max(5) Integer rating, @NotBlank String notes) {
    	
    	this.burgerName = burgerName;
    	this.restaurant = restaurant;
    	this.rating = rating;
    	this.notes = notes;
    }

// ==========================
//     GETTERS / SETTERS
// ==========================
    @PrePersist
    protected void onCreate(){	this.createdAt = new Date();}
    @PreUpdate
    protected void onUpdate(){	this.updatedAt = new Date();}
    // add getters/setters for ALL attributes 
    // **HERE**


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getBurgerName() {
		return burgerName;
	}


	public void setBurgerName(String burgerName) {
		this.burgerName = burgerName;
	}


	public String getRestaurant() {
		return restaurant;
	}


	public void setRestaurant(String restaurant) {
		this.restaurant = restaurant;
	}


	public Integer getRating() {
		return rating;
	}


	public void setRating(Integer rating) {
		this.rating = rating;
	}


	public String getNotes() {
		return notes;
	}


	public void setNotes(String notes) {
		this.notes = notes;
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
    
}
