package com.codingdojo.zookeeper;

public class Gorilla extends Mammal {
	
	public Gorilla() {
		
	}
	
		
		public void throwSomething() {
			setEnergyLevel(getEnergyLevel() - 5);
			System.out.println("Threw rocks. " + "New energy level: " + getEnergyLevel() );
	}
		
		public void eatBananas() {
			setEnergyLevel(getEnergyLevel() + 10);
			System.out.println("Ate Bannanas. " + "New energy level: " +  getEnergyLevel());		
	}
	
		public void climb() {
			setEnergyLevel(getEnergyLevel() - 10);
			System.out.println("Climed a tree. " + "New energy level: " +  getEnergyLevel());
	}

}
