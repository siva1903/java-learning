import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
		int res=0;
	while(n !=0){

	int temp=n%10;
	res=res*10+temp;
	n=n/10;
	}
	System.out.println(res);
	}
	
}
