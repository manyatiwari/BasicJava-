/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    int n =111;
	    int i=0;
	    int ans=0;
	    while(n>0)
	    {
	        int bit = n%10;
	        if(bit == 1){
	        ans = (bit * (int)Math.pow(2,i)) + ans;}
	        n=n/10;
	        i++;
	    }
	    System.out.println(ans);
	}
}
