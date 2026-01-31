import java.util.*;
import java.lang.*;
import java.io.*;
//get input for variable income 7000 grater loan approveval
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner sc = new Scanner(System.in);
	int income = sc.nextInt();
	boolean b =income>=7000;
	if(b){
	    System.out.println("avail loan");
	}
	else{
	    System.out.println("not avail");
	}
	}
}
