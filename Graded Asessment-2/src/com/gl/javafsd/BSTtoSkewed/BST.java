package com.gl.javafsd.BSTtoSkewed;

public class BST {
 
    public static class TreeNode
    {
        int data;
        TreeNode left;
        TreeNode right;
        TreeNode(int data)
        {
            this.data=data;
        }
    }

    public void inOrder(TreeNode root) {
        if(root !=  null) {
            inOrder(root.left);
            System.out.printf("%d ",root.data);
            inOrder(root.right);
        }
       

    }
 
    public static void main(String[] args)
    {
        BST bi=new BST();
        // Creating a binary tree
        TreeNode rootNode=createBinaryTree(); 
        bi.inOrder(rootNode);
 
        System.out.println();
    }
 
    public static TreeNode createBinaryTree()
    {
 
        TreeNode rootNode =new TreeNode(40);
        TreeNode node20=new TreeNode(20);
        TreeNode node10=new TreeNode(10);
        TreeNode node30=new TreeNode(30);
        TreeNode node60=new TreeNode(60);
        TreeNode node50=new TreeNode(50);
        TreeNode node70=new TreeNode(70);
 
        rootNode.left=node20;
        rootNode.right=node60;
 
        node20.left=node10;
        node20.right=node30;
 
        node60.left=node50;
        node60.right=node70;
 
        return rootNode;
    }
}