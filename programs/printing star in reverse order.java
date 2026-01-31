import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{

       Scanner sc = new Scanner(System.in);
       int n =sc.nextInt();
       for(int i=0;i<=n;i++){
           for(int j=n-1;j>i;j--){
               System.out.print("*");
           }
           System.out.println();
       }
    }
    
}