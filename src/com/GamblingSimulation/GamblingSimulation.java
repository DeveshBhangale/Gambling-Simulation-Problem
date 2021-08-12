package com.gamblingsimulation;
import java.util.*;

public class GamblingSimulation {
	//Use Case - 1
	public static final int stake = 100,bet = 1,days=20,months=2;
	
	
	public static boolean gamble() {
		if(Math.random()<0.5) 	
			return true;
		else
			return false;
	}
	
	public static boolean gambling(int cnt, int win, int lose) {
		int flag = 0;
		while(true) {
			if(gamble())
				cnt+=1;
			else
				cnt-=1;
				
			if(cnt == win) {
				flag = 1;
				return true;
			}
			else if(cnt == lose){
				flag = 0;
				return false;
			}
		}
	}
	
	public static void main(String[] args) {
		double formula = ((double)50/stake) * 100;
		int win = stake + (int)formula;
		int lose = -(int)formula;
		int cnt = 0,j=0;
		String[] arr = new String[days];
		int[] eachMonthWinRatio = new int[days];
		int[] eachMonthLostRatio = new int[days];
		//Use Case - 2
		System.out.println("Use Case 2");
		if(gamble())
			System.out.println("Congrats you've won the bet "+bet +"$\n");
		else
			System.out.println("Sorry, you've lost the bet "+bet +"$\n");
		
		//Use Case - 3 & 4 & 5
		while(j<months) {
			int w=0,l=0;
			for(int i=0; i<days;i++) {			
				if(gambling(cnt,win,lose)) {
					arr[i] = "Won";
					w+=1;
				}
				else {
					arr[i] = "Lost";
					l+=1;
					}				
			}
			eachMonthWinRatio[j] = w;
			eachMonthLostRatio[j] = l;
			j++;
	
		}
		System.out.println("Each Month Win and Lost Ratios");
		System.out.println(Arrays.toString(eachMonthWinRatio));
		System.out.println(Arrays.toString(eachMonthLostRatio));
	}

}
