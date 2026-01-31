import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
		int num = 123574;
		int reverse=0;
		while(num !=0){
		    int digit = num%10;
		    reverse = reverse*10+digit;
		    num = num/10;
		    
		 
		}
		  System.out.println(reverse); 
	}
}
