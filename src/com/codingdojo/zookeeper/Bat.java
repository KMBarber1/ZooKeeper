package com.codingdojo.zookeeper;

public class Bat extends Mammal {
	
	public Bat( ) {
		setEnergyLevel(300);
	}
	
	
	
	public void fly() {
		setEnergyLevel(getEnergyLevel() - 50);
		System.out.println("Squeeeeeeak! " + "New energy level: " + getEnergyLevel() );
 }
	
	public void eatHumans() {
		setEnergyLevel(getEnergyLevel() + 25);
		System.out.println("Crunch, Crunch, Crunch! " + "New energy level: " +  getEnergyLevel());		
 }

	public void attackTowns() {
		setEnergyLevel(getEnergyLevel() - 100);
		System.out.println("Snap, Crackle, Pop! " + "New energy level: " +  getEnergyLevel());
 }

}
