import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();

        int factorial = 1; 

        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        System.out.println("Factorial :" + n+ " ans: " + factorial);
    }
}   