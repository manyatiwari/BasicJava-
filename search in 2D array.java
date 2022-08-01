/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class main
{
	public static void main (String[] args) throws java.lang.Exception
	{
	  int arr[][] = {{1, 45, 56},
	               {1, 45, 56},
	               {1, 45, 56}};
	  int t = 56;
	  int ans [] = linearsearch(arr,t);
	  
	  System.out.println(Arrays.toString(ans));
	}
	
	static int[] linearsearch(int arr[][],int t){
	    
	   
	    
	    for(int row = 0; row<arr.length; row++){
	        for(int col =0;col<arr[row].length;col++){
	            if(arr[row][col] == t)
	            return new int[]{row,col};
	        }
	    }
	    
	    return new int[]{-1,-1};
	}
	
}
