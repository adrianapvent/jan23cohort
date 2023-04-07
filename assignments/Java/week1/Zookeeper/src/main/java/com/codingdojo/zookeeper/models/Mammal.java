/**
 * 
 */
package com.codingdojo.zookeeper.models;

/**
 * @author Adriana.Pena
 *
 */
public class Mammal {

	// attributes
	public int energyLevel;

	// constructor
	public Mammal() {
		energyLevel = 100;
	}

	public int getEnergyLevel() {
		return energyLevel;
	}

	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}

	// methods
	public int displayEnergy() {
		System.out.println("Energy Level: " + energyLevel);
		return energyLevel;
	}

}
