package com.boundByVision.tree;

public class TreeImplimentation {
	Node root;
	
	static class Node{
		Object data;
		Node leftChild;
		Node rightChild;
		
		Node(Object data){
			this.data = data;
		}
	}
	public static void main(String[] args) {
		TreeImplimentation t = new TreeImplimentation();
		t.root = new Node("A");
		t.root.leftChild = new Node("B");
		t.root.rightChild = new Node("C");
		t.root.leftChild.rightChild = new Node("D");
		t.root.leftChild.leftChild = new Node("E");
		t.root.rightChild.leftChild = new Node("F");
		t.root.rightChild.rightChild = new Node("G");
	}
}
