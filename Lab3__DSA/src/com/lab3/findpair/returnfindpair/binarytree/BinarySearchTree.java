package com.lab3.findpair.returnfindpair.binarytree;

public class BinarySearchTree {
	public Node root;

	public class Node {
		public int data;
		public Node left;
		public Node right;

		public Node(int data) {
			super();
			this.data = data;
		}
	}

	public BinarySearchTree() {
		this.root = null;
	}

	public void insert(int key) {
		root = insertKey(root, key);
	}

	public Node insertKey(Node root, int key) {
		if (root == null) {
			root = new Node(key);
			return root;
		}

		if (key < root.data) {
			root.left = insertKey(root.left, key);
		}

		else if (key > root.data) {
			root.right = insertKey(root.right, key);
		}

		return root;
	}

	public void inOrder() {
		System.out.println("Inorder Traversal is");
		inOrderDisplay(this.root);

	}

	public void inOrderDisplay(Node root) {
		if (root != null) {
			inOrderDisplay(root.left);
			System.out.print(root.data + " ");
			inOrderDisplay(root.right);
		}

	}
}
