package com.buildingfloors.driver;
import java.util.*;
import com.buildingfloors.service.*;
/*
 * Below is the driver code for question 1 of Graded Coding Assignment 2
 * */
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the total no of floors in the building");//Take input of number of floors in the building
		int floors=sc.nextInt();
		AnalyzeConstruction analyze=new AnalyzeConstruction();
		analyze.getFloorSize(floors);//getFloorSize method takes the input of floor size on each day
		analyze.constructionOrder();//constructionOrder analyzes the order of construction		
		sc.close();

	}

}
