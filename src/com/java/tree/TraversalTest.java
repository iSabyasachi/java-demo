package com.java.tree;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.jupiter.api.Test;

class TraversalTest {
	
	@Test
    public void emptyArray(){
        TreeNode expected = null;
        assertThat(Traversal.buildTree(arrayFrom()), is(expected));
    }
	@Test
    public void arrayWithMultipleElements() {
        TreeNode expected = new TreeNode(17, new TreeNode(0, new TreeNode(3), new TreeNode(15)), new TreeNode(-4));
        assertThat(Traversal.buildTree(arrayFrom(17, 0, -4, 3, 15)), is(expected));
    }
    private Integer[] arrayFrom(Integer... values) {
        return values;
    }

}
