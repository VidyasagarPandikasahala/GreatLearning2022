/**
 * Driver Class
 */

package com.paymoney;

import java.util.Scanner;

public class PayMoneyApp {

	public static void main(String[] args) {
		
		PayMoneyTransaction transaction = new PayMoneyTransaction();		
		Scanner provide = new Scanner(System.in);
		
		System.out.println ("Enter the size of transaction array i.e. no of days transaction");
		
		int sizeArray = provide.nextInt();		
		int [] transactions = new int[sizeArray];
				
		for (int i= 0; i<sizeArray ; i++) {
			System.out.println ("Enter the values of transaction " +(i+1));
			transactions[i]= provide.nextInt();			
		}
		
		System.out.println ("Enter the no. of targets to be acheived");
		int noOfTargets = provide.nextInt();
	
		for (int i = 1 ; i<=noOfTargets; i++) {	
			System.out.println();
			System.out.println ("Enter the value of target");
			int targetValue = provide.nextInt();
			int transactionCount =transaction.achievedTransactionTarget(transactions, targetValue);
			
			if(transactionCount == 0) {
				System.out.println("Given target is not achieved");
			}
			else {
				System.out.println("Target  achieved after " + transactionCount + " transactions");
			}
			System.out.println();
		}
		provide.close();	
	}

}
