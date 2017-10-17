package binaryTree;

public class binaryTreeApp {

	public static void main(String[] args) {
		
		// define list of numbers to add to tree
		int[] nums = { 20, 56, 34, 1, 5, 7, 9, 39, 99, 123, 5435, 3, 10, 56 };
		
		// create binary tree and add numbers
		
		BinaryTree tree = new BinaryTree();
		
		for (int num : nums) {
			tree.addValue(num);
		}
		tree.showTree();
		
		//Node test = new Node(20, null, null);		
		//Node test2 = new Node(56, null, null);
		//test.setRight(test2);
		
		//test.showNode();
		//test2.showNode();
		
		
		
		// remove some numbers
		
	
	}

}
