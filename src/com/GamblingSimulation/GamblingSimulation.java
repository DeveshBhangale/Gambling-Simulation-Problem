package com.gamblingsimulation;

public class gamblingSimulation {
	//Use Case - 1
	public static final int stake = 100;
	public static final int bet = 1;
	
	public static boolean gamble() {
		if(Math.random()<0.5) 	
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		double formula = ((double)50/stake) * 100;
		int win = stake + (int)formula;
		int lose = -(int)formula;
		int cnt = 0;
	
		//Use Case - 2
		if(gamble())
			System.out.println("Congrats you've won the bet "+bet +"$");
		else
			System.out.println("Sorry, you've lost the bet "+bet +"$");
		
		//Use Case - 3 
		while(true) {
			if(gamble())
				cnt+=1;
			else
				cnt-=1;
				
			if(cnt == win) {
				System.out.println("Congrats you've won the and the stake amount is "+win +"$");
				break;
			}
			else if(cnt == lose){
				System.out.println("Sorry, you've lost the bets and the stake amount is "+ (stake-lose) +"$");
				break;
			}
		}
		
	}

}
