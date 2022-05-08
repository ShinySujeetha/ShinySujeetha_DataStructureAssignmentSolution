package com.gl.javafsd.BSTtoSkewed;

public class Skewed {
	static class Node
	{
	    int key;
	    Node left, right;
	}
	static Node newNode(int key)
	{
	    Node temp = new Node();
	    temp.key = key;
	    temp.left = temp.right = null;
	    return (temp);
	  
	}
}

