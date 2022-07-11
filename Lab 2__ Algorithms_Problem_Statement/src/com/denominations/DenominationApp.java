package com.denominations;

import java.util.Scanner;

public class DenominationApp {

	public static void main(String[] args) {
		CheckDenomination cd = new CheckDenomination();			
		MergeSort sort = new MergeSort();
		
		Scanner provide = new Scanner(System.in);
		
		System.out.println ("Enter the size");		
		int sizeArray = provide.nextInt();		
		int [] dinomination = new int[sizeArray];		
		
		for (int i= 0; i<sizeArray ; i++) {
			System.out.println ("Enter the values of Denomination" +(i+1));			
			dinomination[i]= provide.nextInt();			
		}
		
		System.out.println();
		System.out.println ("Enter the amount you want to pay");
		
		int payableAmount = provide.nextInt();
		System.out.println();
		 	 
		 sort.performMergeSort(dinomination);
		
		
		 int[] dinominationCount = new int[sizeArray];		
		 dinominationCount =  cd.provideDinomination(dinomination,payableAmount);
		
		
		if(dinominationCount.length == 0) { // if the denomination array length is zero then it means the currency is not available
			System.out.println("Amount to be paid cannot be achieved");
		}
		else {
			 System.out.println ("Your payment approach in order to give min no of notes will be :");
		 
			 for (int i= 0 ; i<sizeArray;i++) {
				 
				 if(dinominationCount[i] == 0) { // if the denominationCount is value is zero ignored
				 continue;
				 }
				 else{
					 System.out.println (dinomination[i] +":" +dinominationCount[i]);
				 }
			 }
			 
		}
		 provide.close();

	}

}
