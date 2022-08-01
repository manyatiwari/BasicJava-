/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class main
{
	public static void main (String[] args) throws java.lang.Exception
	{
	  int arr [] = {1, 45, 56, 34, 32, 456, 78};
	  int t = 56;
	  
	  System.out.println(linearsearch(arr,t));
	}
	
	static boolean linearsearch(int arr[],int t){
	    
	    if(arr.length == 0)
	    return false;
	    
	    for(int i:arr){
	        if(i==t)
	        return true;
	    }
	    
	    return false;
	}
	
}
