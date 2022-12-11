package com.java.tree;

import java.util.*;

public class BinaryTreeInorderTraversal{
    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        List<Integer> result = inorderTraversal(root);
        System.out.println(result);
        //root = [1,null,2,3]
        //output : 1, 3 ,2
    }
    public static List<Integer> inorderTraversal(TreeNode root) {
        //InorderTraversal
        // store the root val in result , then traverse to left, then travrese to right of the root,
        List<Integer> result = new ArrayList<>();
        ArrayDeque<TreeNode> stack = new ArrayDeque<>();
        Set<Integer> isPresent = new HashSet<>();
        stack.push(root);
        while(stack.peek() != null){                  
            TreeNode currNode = stack.peek();
            if(currNode.left != null && !isPresent.contains(currNode.left.val)){
                stack.push(currNode.left);
            }else if(currNode.left == null || (currNode.left != null && !isPresent.contains(currNode.left.val))){
                currNode = stack.pop();
                isPresent.add(currNode.val);
                result.add(currNode.val);                
            }
            
            if(currNode.right != null && !isPresent.contains(currNode.right.val)){
                stack.push(currNode.right);                
            }
            
        }
        return result;
    }
    
}

