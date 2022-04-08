/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{   int n = 5;
		int m=n;
        int mask=0;
        
        if(n == 0)
            System.out.println("1");
        
        while(m!=0){
            mask = (mask<<1) | 1;
            m=m>>1;
        }
        int ans = (~n) & mask;
         System.out.println(ans);
	}
}
