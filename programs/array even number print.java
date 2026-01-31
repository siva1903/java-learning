import java.util.*;
import java.lang.*;
import java.io.*;
//using array printing the number of even digints we stored output
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	   
	    Scanner sc = new Scanner(System.in);
	    int n =sc.nextInt();
	    int[] arr = new int[n];
	    
	    for(int i=0;i<n;i++){
	        //whyb i use loop to avoid the code extra 
	        //actaual funtion looks LinkageError
	        //arr[0]=2
	        //arr[1]=5
	        //arr[2]=7
	        arr[i]=sc.nextInt();
	    }
	    for(int i=0;i<n;i++){
	      if(i%2==0)
	           System.out.println(arr[i]);
	       }
	    }
	    
	}
