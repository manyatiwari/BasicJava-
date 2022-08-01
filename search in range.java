/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class main
{
	public static void main (String[] args) throws java.lang.Exception
	{
	 String str = "Manya";
	 char ch = 'a';
	 int start = 1;
	 int end = 3;
		
		System.out.println(linearsearch(str,ch,start,end));
	}
	
	static boolean linearsearch(String str, char ch,int start,int end){
	    
	    if(str.length()==0)
	    return false;
	    
	    for(int i=start;i<end;i++){
	        if(str.charAt(i) == ch)
	          return true;
	    }
	    return false;
	}
}
