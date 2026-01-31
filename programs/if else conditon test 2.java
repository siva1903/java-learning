import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
	    int score = sc.nextInt();
	    if(score<50){
	        System.out.println("improve");
	    }
	    else if(score>=50 && score<=70){
	        System.out.println("good");
	    }
	    else 
	    System.out.println("excelent");
	}
}
