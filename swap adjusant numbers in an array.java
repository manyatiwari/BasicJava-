/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

class main
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    int arr[] = {1,2,3,4,5,6,7};
	    int n=7;
	    SwapAdju(arr,n);
	}
	static void SwapAdju(int arr[], int n)
	{
	    for(int i=0;i<n;i+=2){
			if(i+1 < n){
	        int temp=arr[i];
	        arr[i]=arr[i+1];
	        arr[i+1]=temp;  }}
	
	    for(int j=0;j<n;j++){
	        System.out.print(arr[j] + " ");
	    } 
       
	}
}