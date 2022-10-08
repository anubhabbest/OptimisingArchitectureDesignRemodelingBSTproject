package com.transactionsbst.model;

/*
 * This class will help us create nodes for our BST
 * */

public class Node
{
	public int data;
	public Node left,right;
	public Node(int data)
	{
		this.data=data;
		left=null;
		right=null;
	}
}
