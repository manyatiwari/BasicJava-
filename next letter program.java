
import java.lang.*;
import java.io.*;
import java.util.Scanner;

class main{
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        char ch1 = sc.next().charAt(0);
        char ch2 = sc.next().charAt(0);
        
        System.out.println(nextletter(ch1,ch2));
    }
    static char nextletter(char ch1, char ch2){
       
       int a = (int)ch1;
       int b = (int)ch2;
       int c = b-a;
       
       int d = b+c;
       char ch3 = (char)d;
       return ch3;
    }
}