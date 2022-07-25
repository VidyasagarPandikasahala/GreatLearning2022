package com.lab3.balancingbrackets.driver;

import com.lab3.balancingbrackets.checkbalancingbrackets.CheckBalanceBrackets;

public class BalanceBracketDriver {

	public static void main(String[] args) {
		CheckBalanceBrackets check = new CheckBalanceBrackets();
		String bracketExpression = "( [ [ { } ] ] )";
		boolean result;
		result = check.findPair(bracketExpression);

		if (result) {
			System.out.println("The entered String has Balanced Brackets");
		} else {
			System.out.println("The entered Strings do not contain Balanced Brackets");
		}
	}

}
