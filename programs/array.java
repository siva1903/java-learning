import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
	    int ns =5;
	    int[] marks = new int[ns];
	    int total = 0;
	    
	    for(int i=0;i<ns;i++){
	        marks[i]=sc.nextInt();
	        total +=marks[i];
	    }
	    
	     int avg =total/ns;
	  
	  	if(avg<35){
	    System.out.println("need class");
	}
    else{
	    System.out.println("no need of class");
    	}
    }
}