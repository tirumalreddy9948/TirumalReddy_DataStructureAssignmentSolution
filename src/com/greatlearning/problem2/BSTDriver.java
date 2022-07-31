package com.greatlearning.problem2;

public class BSTDriver {

	public static void main(String[] args) {
		// 50
		// / \
		// 30 60
		// / /
		// 10 55

		BSTService tree = new BSTService();
		tree.node = new Node(50);
		tree.node.left = new Node(30);
		tree.node.right = new Node(60);
		tree.node.left.left = new Node(10);
		tree.node.right.left = new Node(55);

//Order of the Skewed tree can be defined as follows -
//For Increasing order - 0
//For Decreasing order - 1
		int order = 0;
		BSTService.flattenBTToSkewed(BSTService.node, order);
		BSTService.traverseRightSkewed(BSTService.headNode);
	}
}
