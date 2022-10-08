package com.transactionsbst.driver;
import com.transactionsbst.model.*;
import com.transactionsbst.service.*;

/*
 * This is driver code for question 2 of Graded Coding Assignment 2
 * */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BST tree = new BST(); //The BST has been hard coded as per mentioned in the question statement
		tree.node = new Node(50); 
		tree.node.left = new Node(30); 
		tree.node.right = new Node(60); 
		tree.node.left.left = new Node(10); 
		tree.node.right.left= new Node(55);

		BSTConvertionToLL.skewConvertion(tree.node);//we are calling skewConvertion method to convert the BST into a right skewed BST
		BSTConvertionToLL.PrintSkewBST();//we are calling PrintSkewBST to print the data values for right skewed BST

	}

}
