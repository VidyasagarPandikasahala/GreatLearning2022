package com.lab3.findpair.returnfindpair;

import java.util.Set;
import com.lab3.findpair.returnfindpair.binarytree.BinarySearchTree.Node;

public class PairUtil {

	public static boolean findPairUtil(Node root, int sum, Set<Integer> set) {

		if (root == null) {
			return false;
		}

		if (findPairUtil(root.left, sum, set)) {
			return false;
		}

		if (set.contains(sum - root.data)) {
			System.out.println("Pair is found(" + (sum - root.data) + "," + root.data + ")");
			return true;
		}

		else {
			set.add(root.data);
		}
		return findPairUtil(root.right, sum, set);
	}
}
