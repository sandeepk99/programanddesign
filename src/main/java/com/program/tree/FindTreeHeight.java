package com.program.tree;

/***
 *
 * Q1 - Find Height of the tree..
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
    public int heightBottomUpApproach(TreeUtility.Node curr) {

        return 0;

    }

}
