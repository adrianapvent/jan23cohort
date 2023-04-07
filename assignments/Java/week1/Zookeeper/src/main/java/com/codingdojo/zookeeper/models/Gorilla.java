/**
 * 
 */
package com.codingdojo.zookeeper.models;

/**
 * @author Adriana.Pena
 *
 */
public class Gorilla extends Mammal {
	
	public void throwSomething() {
		this.setEnergyLevel(this.getEnergyLevel()- 5);
		System.out.println("Gorilla threw a fruit. New Energy Level:" + this.getEnergyLevel());
		
	}
	public void eatBananas() {
		this.setEnergyLevel(this.getEnergyLevel()+ 10);
		System.out.println("Gorilla ate a banana. New Energy Level:" + this.getEnergyLevel());
		
	}
	public void climb() {
		this.setEnergyLevel(this.getEnergyLevel()- 10);
		System.out.println("Gorilla is climbing a tree. New Energy Level:" + this.getEnergyLevel());
		
	}

}
