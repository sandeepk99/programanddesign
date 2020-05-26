package com.program.tree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TreeProgramTest {

    TreeUtility treeUtility;
    FindTreeHeight fh;

    @BeforeEach
    public void setUp() {
        treeUtility = new TreeUtility();
        treeUtility.add(5);
        treeUtility.add(3);
        treeUtility.add(2);
        treeUtility.add(4);
        treeUtility.add(7);
        treeUtility.add(6);
        treeUtility.add(8);
        fh= new FindTreeHeight();
    }

    @Test
    public void test_findHeight_topDown() {
        Assertions.assertEquals(2, fh.height(treeUtility));
        treeUtility.print();
    }

}
