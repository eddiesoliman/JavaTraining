package binaryTree;

public class Node {
		
	private int value;
	private Node left;
	private Node right;
	
	public Node (int value, Node left, Node right) {
		this.value = value;
		this.left = left;
		this.right = right;
	}
	
	public void setLeft(Node node) {
		this.left = node;
	}
	
	public void setRight(Node node) {
		this.right = node;
	}
	
	public Node getLeft() {
		return left;
	}
	
	public Node getRight() {
		return right;
	}
	
	public int getValue() {
		return value;
	}
	
	public void showNode() {
		System.out.println(this + "      " + left + " : " + value + " : " + right);
	}
}
