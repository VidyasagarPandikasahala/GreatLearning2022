package com.lab3.balancingbrackets.driver;

import com.lab3.balancingbrackets.checkbalancingbrackets.CheckBalanceBrackets;

public class BalanceBracketDriver {

	public static void main(String[] args) {
		CheckBalanceBrackets check = new CheckBalanceBrackets();
		String bracketExpression = "( [ [ { } ] ] ) )";
		boolean result;
		result = check.findPair(bracketExpression);

		if (result) {
			System.out.println("The brackets are balanced");
		} else {
			System.out.println("The brackets are unbalanced");
		}
	}

}
