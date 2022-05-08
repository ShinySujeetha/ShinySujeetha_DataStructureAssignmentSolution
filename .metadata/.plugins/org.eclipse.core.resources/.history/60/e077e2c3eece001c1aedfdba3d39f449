package com.gl.javafsd.FloorPlanning;
import java.util.Scanner;

public class DriverClass {
	public static void main(String[] args) {
		System.out.println("Enter the no.of floors in the building");
		Scanner sc = new Scanner(System.in);
		int floors=sc.nextInt();
		int array[]=new int[floors+1];
		for(int index=1;index<=floors;index++) {
			System.out.println("Enter the floor size given on day : "+index);
		    array[index]=sc.nextInt();
		}
		System.out.println("The order of construction is as follows");
		FloorPlanner planner=new FloorPlanner(array,floors);
	}
}

