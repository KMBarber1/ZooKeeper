package com.codingdojo.zookeeper;

public class TestBat {

	public static void main(String[] args) {

//			Bat Test	
				Bat b1 = new Bat();
				
				b1.attackTowns();
				b1.attackTowns();
				b1.attackTowns();
				
				b1.eatHumans();
				b1.eatHumans();
				
				b1.fly();
				b1.fly();
				
				b1.displayEnergyLevel();
				
//				Gorilla Test
				Gorilla g1 = new Gorilla();
				
				g1.throwSomething();
				g1.throwSomething();
				g1.throwSomething();
				
				g1.eatBananas();
				g1.eatBananas();

				g1.climb();
				
				g1.displayEnergyLevel();
			}

		}