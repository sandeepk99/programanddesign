package com.program.tree;

public class BinaryTreeNode<T> {

	private T data;
    
	private BinaryTreeNode<T> left;

	private BinaryTreeNode<T> right;

	public T getData() {
		return data;
	}

	public BinaryTreeNode<T> getLeft() {
		return left;
	}

	public BinaryTreeNode<T> getRight() {
		return right;
	}

	public BinaryTreeNode(T data) {
		super();
		this.data = data;
		this.left = null;
		this.right = null;
	}
	
	@Override
	public String toString() {
		return "DATA : " + data;
	}


}
