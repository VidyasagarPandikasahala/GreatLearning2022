package com.lab3.balancingbrackets.checkbalancingbrackets;

import java.util.Stack;

public class CheckBalanceBrackets {

	public CheckBalanceBrackets() {
	}

	public boolean findPair(String bracketExpression) {

		Stack<Character> stack = new Stack<Character>();

		for (int i = 0; i < bracketExpression.length(); i++) {
			char x = bracketExpression.charAt(i);

			if (x == '(' || x == '[' || x == '{') {

				stack.push(x);
				continue;
			}

			if (stack.isEmpty()) {
				return false;
			}

			char check;
			switch (x) {

				case ')':
					check = stack.pop();
					if (check == '{' || check == '[')
						return false;
					break;

				case ']':
					check = stack.pop();
					if (check == '(' || check == '{')
						return false;
					break;

				case '}':
					check = stack.pop();
					if (check == '[' || check == '(')
						return false;
					break;
			}
		}

		return true;
	}
}
