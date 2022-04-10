/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n = 1330;
		int h=0,f=0,t=0,o=0;
		
		switch(1){
		case 1: h=n/100;
		        System.out.println(h +" notes of 100");
		        n=n-(h*100);
		        
		case 2: f=n/50;
		        System.out.println(f + " notes of 50");
		        n=n-(f*50);
		        
	    case 3: t=n/20;
		        System.out.println(t + " notes of 20");
		        n=n-(t*20);
		        
		case 4: o=n/1;
		        System.out.println(o + " notes of 1");
		        n=n-(f*1);
		        break;
		}
    }
}
