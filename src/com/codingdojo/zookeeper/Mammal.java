package com.codingdojo.zookeeper;

public class Mammal {
	
	protected Integer energyLevel = 100;
//	private Integer energyLevel = 300;
	
	public Mammal() {
		
	}
	
	public Integer displayEnergyLevel() {
		System.out.println("Current energy level is: " + energyLevel);
		return energyLevel;
	}

	
//	Getters and Setters
	public Integer getEnergyLevel() {
		return energyLevel;
	}

	public void setEnergyLevel(Integer energyLevel) {
		this.energyLevel = energyLevel;
	}

}
