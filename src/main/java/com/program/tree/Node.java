package com.program.tree;

public class Node<T> {

	private T data;
    
	private Node<T> left;

	private Node<T> right;

	public T getData() {
		return data;
	}

	public Node<T> getLeft() {
		return left;
	}

	public Node<T> getRight() {
		return right;
	}

	public Node(T data) {
		super();
		this.data = data;
		this.left = null;
		this.right = null;
	}
	
	@Override
	public String toString() {
		return "DATA : " + data;
	}

	/**
	 * 
	 * Binary Tree Insert 
	 */
	public void insertBT(T data  ) {
		Node<T> node = new Node<T>(data);
	}
	
	/**
	 * 
	 * Binary Search Tree Insert 
	 */
	public void insertBST(T data) {
		Node<T> node = new Node<T>(data);
		
	}
	
	/**
	 * The Depth of a Node is the number of edges 
	 * between node and the root node
     *
	 */
	int depthOfNode(Node node){
		return 0;
		
	}
	
	/***
	 * The height of a tree - The depth of the deepest Node
	 * 
	 * 
	 */
	int getHeight(){
		return 0;
		
	}
	
	/**
	 * Is the tree balanced - 
	 */
	boolean isTreeBalanced(){
		return false;
		
		
	}

}
