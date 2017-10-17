package binaryTree;

public class BinaryTree {
	
	private Node head = null;
	
	public void addValue(int value) {
		Node node = new Node(value, null, null);
		
		if (head == null) {
			head = node;
			return;
		} 
		else {
			addNodeToTree(head, node);
		}
	}
	
	public void removeValue(int value) {
		
	}
	
	public void showTree() {
		showBranch(head);
	}
	
	private void showBranch(Node currentHead) {
		
		currentHead.showNode();
		if (currentHead.getLeft() != null) {
			showBranch(currentHead.getLeft());
		}
		if (currentHead.getRight() != null) {
			showBranch(currentHead.getRight());
		}
	}
	
	private void addNodeToTree(Node currentNode, Node nodeToAdd) {
		
		if (currentNode.getValue() == nodeToAdd.getValue()) {
			return;
		}
		else if (nodeToAdd.getValue() < currentNode.getValue()) {
			if (currentNode.getLeft() == null) {
				currentNode.setLeft(nodeToAdd);
			}
			else {
				addNodeToTree(currentNode.getLeft(), nodeToAdd);
			}
		}
		else {
			if (currentNode.getRight() == null) {
				currentNode.setRight(nodeToAdd);
			}
			else {
				addNodeToTree(currentNode.getRight(), nodeToAdd);
			}
		}
	}
}
