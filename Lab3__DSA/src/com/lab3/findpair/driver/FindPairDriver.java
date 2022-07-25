package com.lab3.findpair.driver;

import com.lab3.findpair.returnfindpair.FindPairWithGivenSum;

import com.lab3.findpair.returnfindpair.binarytree.BinarySearchTree;

public class FindPairDriver {

	public static void main(String[] args) {

		BinarySearchTree tree = new BinarySearchTree();
		FindPairWithGivenSum find = new FindPairWithGivenSum();

		tree.insert(40);
		tree.insert(20);
		tree.insert(60);
		tree.insert(10);
		tree.insert(30);
		tree.insert(60);
		tree.insert(50);
		tree.insert(70);

		tree.inOrder();
		int sum = 130;

		System.out.println("\n");
		System.out.println("*******************************");
		System.out.println();

		find.findPairWithGivenSum(tree.root, sum);
	}

}
