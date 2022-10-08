package com.transactionsbst.service;
import com.transactionsbst.model.*;

/*
 * BSTConvertionToLL method converts the given BST into a right skewed BST
 * PrintSkewBST method prints the right skewed BST
 * */

public class BSTConvertionToLL {
	static Node head=null,prev=null;
	public static void skewConvertion(Node root)
	{
		if(root==null)//if the current node is null then we will just return
			return;
		skewConvertion(root.left);//we will recursively call BSTConvertionToLL for the left subtree
		if(prev==null)
			head=root;//in case there is no node previous to the current node then the current node is the head of our skewed BST 
		else
		{
			prev.right=root;//otherwise our current element will be the right node of the previous node
			root.left=null;
		}
		prev=root;//now we will just set the current node as our previous node 
		skewConvertion(root.right);//and recursively move to our right subtree 
	}

	public static void PrintSkewBST()
	{
		if(head==null)
			System.out.println("The tree is empty");
		Node node=head;
		while(node!=null)//we will iterate till we reach the end of our skew BST 
		{
			System.out.print(node.data+" ");
			node=node.right;
		}

	}
}
