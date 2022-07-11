package com.paymoney;

public class PayMoneyTransaction {

	PayMoneyTransaction() {
	}
	

	/**
	 * Method to get the no of transaction to achieve target value
	 * @param transaction - list of daily transaction
	 * @param targetValue - target value to be checked
	 * @return - no of transaction to achieve target value (integer)
	 */
	public int achievedTransactionTarget(int[] transaction, int targetValue) {
		int sum = 0;
		for (int i = 0; i<transaction.length; i++) { 
			if (transaction[i]+sum >= targetValue) {
				return i+1;
			}			
			else  {
				sum = sum + transaction[i];
			}
		}
		return 0;
	}
}