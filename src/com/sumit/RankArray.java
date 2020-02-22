package com.sumit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class RankArray {
	
	static ArrayList<Integer> al = new ArrayList<Integer>(Arrays.asList(4,100,53,98,98,70,100,5,5,69,100));
	static int count = 1;
	static ArrayList<Integer> newal = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		
		Collections.sort(al, Collections.reverseOrder());
		System.out.println("Sorted array now is :" + al);
		
		for(int i=0; i<al.size();i++) 
		{
		  for(int j=i+1;j<al.size();j++) 
		  {
			  if(al.get(i)==al.get(j)) 
			  {
				  newal.add(i, count);
			  }
			  else {
				  break;
			  }
		  }
		  
		  if(((i+1)<al.size()) && (al.get(i)>al.get(i+1)) ) 
		  {
			  count++;
			  newal.add(i+1, count);	  
		  }
		  
		}
		
		System.out.println("Rank of each element is: " + newal);
		
	}
	

}
