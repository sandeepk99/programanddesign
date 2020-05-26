package com.program.tree;

import java.util.ArrayDeque;
import java.util.Queue;

public class TreeUtility {

    Node root;

    class Node {

        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public void add(int data) {
        root = add(root, data);
    }

    private Node add(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }
        if (data < root.data) {
            root.left = add(root.left, data);
        } else if (data > root.data) {
            root.right = add(root.right, data);
        }
        return root;
    }

    public void print() {
        print(root);
    }

    private void print(Node curr) {
        if (curr == null) return;
        print(curr.left);
        System.out.print(curr.data + "  ");
        print(curr.right);
    }

    public void levelOrderTranversal() {
        levelOrderTranversal(root);
    }

    private void levelOrderTranversal(Node root) {
        Node current = root;
        Queue<Node> q = new ArrayDeque<Node>();
        if (current == null) return;
        q.add(current);
        while (!q.isEmpty()) {
            Node curr = q.remove();
            System.out.print(curr.data + " -- >");
            if (curr.left != null) {
                q.add(curr.left);
            }
            if (curr.right != null) {
                q.add(curr.right);
            }
        }
    }

}
