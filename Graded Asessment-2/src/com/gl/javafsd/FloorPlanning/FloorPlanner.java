package com.gl.javafsd.FloorPlanning;
import java.util.Stack;

public class FloorPlanner {
	FloorPlanner(int[] array,int floors){
		 Stack<Integer> stack=new Stack<Integer>();
		 for(int index=1;index<array.length;++index) {
			 if(array[index]!=floors) {
				 stack.push(array[index]);
				 System.out.println("Day: " +index);
				 System.out.println();
			 }
			 else {
				 int count=0;
				 stack.push(array[index]);
				 System.out.println("Day: " +index);
				 while(array[index--]==floors) {
				     System.out.println(stack.pop()+" ");
					 floors--;
					 count++;
 				 }
				 for(int j=0;j<=count;j++) {
				  ++index;
				 }
			 }
			
		}
		 while(!stack.empty()) {
			 System.out.println(stack.pop()+" ");
		 }
		
	}
}


