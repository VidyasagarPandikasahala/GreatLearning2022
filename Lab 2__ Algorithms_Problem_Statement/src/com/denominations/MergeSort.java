/** 
 * Implementation of the merge sort in decreasing order
 */

package com.denominations;

public class MergeSort {
	public MergeSort(){
		
	}
	
	public  void performMergeSort(int[] array){
		int firstIndex = 0;
		int lastIndex = array.length;
		int midIndex = (lastIndex - firstIndex)/2;
		
		if(array.length<2) {
			return;
		}
		
		// to split into leftArray and right Array;
		int leftArray[] = new int[midIndex];
		int rightArray[] =new int[lastIndex-midIndex];
		
		for(int index = 0; index<midIndex; index++) {
			
							
			leftArray[index] = array[index];
			
		}
		
		
		
		for(int index2 = midIndex; index2<lastIndex; index2++) {
			
			rightArray[index2 - midIndex] =  array[index2];
			
		}
		performMergeSort(leftArray);
		performMergeSort(rightArray);
		merge(array, leftArray,rightArray);
		
				
	}
		public static void merge(int []inputArray, int[]leftArray, int[]rightArray) {
			int leftArraySize = leftArray.length;
			int rightArraySize = rightArray.length;
			
			int i = 0;
			int j =0;
			int k = 0;
			
			while  (i < leftArraySize && j < rightArraySize) {
				if(leftArray[i] >= rightArray[i]) {
					inputArray[k]= leftArray[i];
					i++;
				}
				else  {
					inputArray[k]= rightArray[j];
					j++;
				}
				k++;
			}
			
			
			while (i < leftArraySize) {
				inputArray[k] = leftArray [i];
				i++;
				k++;
			}
			while (j < rightArraySize) {
				inputArray[k] = rightArray[j];
				j++;
				k++;
			}
		}
}
