package com.denominations;

public class CheckDenomination {
	public CheckDenomination() 	 {		 
	 }
	 
	public int[] provideDinomination(int[]inputArray, int payableAmount){		 
		 
		 int [] dinominationCounter = new int[inputArray.length];
		 int k = 0;
		 // traversing through the denomination array
		 for (int i = 0; i < inputArray.length; i++) {
             /** if the value of the first index is less than or equal  to the payable amount
              * the denomination count is added into an array and the new payable amount is checked with the next value of the 
              * incremented index of the denomination array array
			 **/
			 if (inputArray[i]<= payableAmount) { 							
				 
				 dinominationCounter[k] = payableAmount / inputArray[i]; // currency count is stored in array
				 payableAmount = payableAmount % inputArray[i]; // remaining payable amount is calculated 
				 k++; 
			}			 
			 else
			 {
				 dinominationCounter [k]=  0; // if the denomination array is greater than payable counter is set to zero
				 k++;				 
			 }
			 if(payableAmount == 0) { // if payable amount is zero then the loop breaks and the denomination counter array is returned
				break;
			 }			 
		 }
		 if (payableAmount !=0) {
			 return new int[0];       // if the payable amount is not equal to zero empty array is returned 
		 }
		  return dinominationCounter; // updated array is returned to the main class
	}
}
