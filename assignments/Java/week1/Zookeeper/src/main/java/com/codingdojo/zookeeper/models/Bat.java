/**
 * 
 */
package com.codingdojo.zookeeper.models;

/**
 * @author Adriana.Pena
 *
 */
public class Bat extends Mammal {
	
	//constructor
	public Bat() {
		super();
		this.setEnergyLevel(300);
	}
	
	//methods
	public void fly() {
		this.setEnergyLevel(this.getEnergyLevel()- 50);
		System.out.println("The Bat has taken flight. New Energy Level:" + this.getEnergyLevel());
	}
	
	public void eatHumans() {
		this.setEnergyLevel(this.getEnergyLevel()+ 25);
		System.out.println("The Bat ate a Human. New Energy Level:" + this.getEnergyLevel());
	}
	
	public void attackTown() {
		this.setEnergyLevel(this.getEnergyLevel()- 100);
		System.out.println("The Bat has burned the town down. New Energy Level:" + this.getEnergyLevel());
	}
}
