import java.util.*;
import java.lang.*;
import java.io.*;
//ist print the numbers that divisible by 3 and 5 or not
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();

	if(num%3==0 && num%5==0){
	    System.out.println("divisible");
	}
	else{
	    System.out.println("not");
	}
	}
}
