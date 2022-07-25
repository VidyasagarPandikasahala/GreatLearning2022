package com.lab3.findpair.returnfindpair;

import java.util.HashSet;
import java.util.Set;

import com.lab3.findpair.returnfindpair.binarytree.BinarySearchTree;
import com.lab3.findpair.returnfindpair.binarytree.BinarySearchTree.Node;

public class FindPairWithGivenSum {
	BinarySearchTree tree = new BinarySearchTree();
	Set<Integer> set = new HashSet<Integer>();
	PairUtil find = new PairUtil();

	public void findPairWithGivenSum(Node root, int sum) {

		if (!find.findPairUtil(root, sum, set)) {
			System.out.println("Pairs do not exist" + "\n");
		}
	}
}
