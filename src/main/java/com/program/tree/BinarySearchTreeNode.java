package com.program.tree;

public class BinarySearchTreeNode<T> {

    private T data;

    private BinarySearchTreeNode<T> left;

    private BinarySearchTreeNode<T> right;

    public T getData() {
        return data;
    }

    public BinarySearchTreeNode<T> getLeft() {
        return left;
    }

    public BinarySearchTreeNode<T> getRight() {
        return right;
    }

    public BinarySearchTreeNode(T data) {
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
