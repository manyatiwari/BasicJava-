/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int arr[] ={12, 14, 16, 90, 56, 45, 34, 23};
		int k = 16;
		
	   
		
		System.out.println(linearsearch(arr,k));
	}
	
	static int linearsearch(int arr[], int s){
	    for(int i=0;i<arr.length;i++){
	        if(arr[i]==s)
	          return i;
	    }
	    return -1;
	}
}
