package programs;

import java.util.Arrays;
import java.util.Scanner;

public class andor {
	public static void main(String [] args) {	
		//bitwise operator (&) tricks 
		/*int x = 1024;
		int y = x-1;
		System.out.println("number is in 2 to the power");
		if((x & y)==0) {
			System.out.println("Yes");
		}
		else System.out.println("NO");*/
		
		//bitwise operator (|) tricks
		/*System.out.println(0^1);
		System.out.println(0^1^2);
		System.out.println(0^1^2^3);
		System.out.println(0^1^2^3^4);
		System.out.println(0^1^2^3^4^5);
		System.out.println(0^1^2^3^4^5^6);
		System.out.println(0^1^2^3^4^5^6^7);
		System.out.println(0^1^2^3^4^5^6^7^8);*/
		
		
		//bitwise operatore (~)
//		System.out.println(~10);
		
		
		//bitwise operatore &
//		
//		int x = 5;
//		int y = 3;
//		System.out.println(x&y);
		
		
		//left shift operator
		long n = 1099511627776l;
		long result = (long)(Math.log(n)/Math.log(2));
        System.out.println(result);
		System.out.println(1l<<40);
	}
}