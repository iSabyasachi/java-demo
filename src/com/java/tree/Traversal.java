package com.java.tree;

import java.util.*;


/*Definition for a binary tree node.*/

public class Traversal {
	public static TreeNode buildTree(Integer[] arr){
        return buildTree(arr, 0);
    }
	
    public static TreeNode buildTree(Integer[] arr, int i){
        if(i > arr.length - 1) return null;
        return new TreeNode(arr[i], buildTree(arr, i * 2 + 1), buildTree(arr, i * 2 + 2));
    }
    public static void main(String[] args){
        Integer[] input = {17, 0, -4, 3, 15};
        TreeNode root = buildTree(input, 0);
        //System.out.println(root.val);
        List<Integer> result = preorderTraversal(root, new ArrayList<>());
        System.out.println(result);
    }
    public static List<Integer> preorderTraversal(TreeNode root, List<Integer> result) {
        if(root != null){
            result.add(root.val);
            preorderTraversal(root.left, result);
            preorderTraversal(root.right, result);
        }
        return result;
    }
}