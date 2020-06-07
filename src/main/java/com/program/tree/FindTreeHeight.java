package com.program.tree;

/***
 *
 * Q1 - Find Height of the tree..
 *
 * Height Of a Node - The number of edges in the longest path from node to the leaf  node
 * Height of a Tree - Height of the Root
 * Depth of a Node - The number of edges from the root node to the given node
 *
 */
public class FindTreeHeight {

    public int height(TreeUtility c) {
         return height(c.root);
        //return heightBottomUpApproach(c.root);
    }
    public int height(TreeUtility.Node curr) {

        if (curr == null) return -1;
        int left = height(curr.left);
        int right = height(curr.right);
        return Math.max(left, right) + 1;
    }

    //TBD
    public int heightTopUpApproach(TreeUtility.Node curr) {

        return 0;

    }

    public boolean isBalanced(TreeUtility tc){
        int result = isBalanced(tc.root);
      return result !=-1;
    }

    private int isBalanced(TreeUtility.Node curr){

        if(curr == null){
            return 0;
        }
        int left = isBalanced(curr.left);
        int right = isBalanced(curr.right);

        if(left==-1 || right ==-1){
            return -1;
        }
        if (left<right)
            return -1;
        return 1+ Math.max(left,right);
    }

}
