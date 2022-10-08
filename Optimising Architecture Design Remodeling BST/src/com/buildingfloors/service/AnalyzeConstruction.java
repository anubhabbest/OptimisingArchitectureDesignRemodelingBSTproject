package com.buildingfloors.service;
import java.util.*;
/*
 * Below is the service code for  question 1 of Graded Coding Assignment 2
 * */
public class AnalyzeConstruction {

	PriorityQueue<Integer> queue=new PriorityQueue<>(Collections.reverseOrder());//we create a priority queue which holds values from max to min
	int []days;
	public void getFloorSize(int floors)//getFloorSize method takes the input of floor size on each day
	{	int size;
	Scanner sc=new Scanner(System.in);
	days=new int[floors];
	for(int i=0;i<floors;i++)//adds the day's tile size to an array and priority queue 
	{
		System.out.println("enter the floor size given on day : "+(i+1));
		size=sc.nextInt();
		days[i]=size;
		queue.offer(size);
	}
	sc.close();
	}
	public void constructionOrder()
	{	
		List<Integer> list=new ArrayList<Integer>();
		System.out.println("The order of construction is as follows");
		for(int i=0;i<days.length;i++)
		{
			System.out.println("Day:"+(i+1));
			list.add(days[i]);
			while(list.contains(queue.peek()))//while the peek element has been added to the list then pop and print it
			{
				System.out.print(queue.poll()+" ");
			}
			System.out.println();
		}
	}
}
