package com.boundByVision.tree;

public class BinarySearchTreeImpl {
	Node root = null;

	class Node {
		Object data;
		Node left;
		Node right;

		Node(Object data) {
			this.data = data;
		}
	}

	public static void main(String[] args) {
		BinarySearchTreeImpl b = new BinarySearchTreeImpl();
		b.add(10);
	}

	private void add(Object obj) {
		Integer givenNodeVal = (Integer) obj; //given node value;
		Node n = new Node(obj);
		if(root == null) {
			root = n;
		}else {
			Node temp = root;
			while(true) {
				
			}
		}
		
	}
}
