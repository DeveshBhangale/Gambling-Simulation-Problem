package com.gamblingsimulation;

public class GamblingSimulation {
	public static final int stake = 100;
	public static final int bet = 1;
	
	public static boolean gamble() {
		if(Math.random()<0.5) 	
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		
		if(gamble())
			System.out.println("Congrats you've won the bet "+bet +"$");
		else
			System.out.println("Sorry, you've lost the bet "+bet +"$");
	}

}
