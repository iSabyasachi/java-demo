package com.java.tree;

import java.util.*;


public class LevelOrderTraversal{
    public static List<List<Integer>> traverse(TreeNode root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);

        List<Integer> level = null;        
        while(!queue.isEmpty()){
            level = new ArrayList<>(); 
            for(int i = 0 ; i < queue.size() ; i++){
                TreeNode curr = queue.remove();
                level.add(root.val);
                
                if(curr.left != null)
                    queue.add(curr.left);
                if(curr.right != null)
                    queue.add(curr.right);

            }
            result.add(level);
        }
        return  result;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(12);
        root.left = new TreeNode(7);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(9);
        root.right.left = new TreeNode(10);
        root.right.right = new TreeNode(5);
        List<List<Integer>> result = LevelOrderTraversal.traverse(root);
        System.out.println("Level order traversal: " + result);
  }
}