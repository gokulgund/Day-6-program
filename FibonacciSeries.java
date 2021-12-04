package com.bl.logical;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {
		System.out.println("Enter The Number : ");
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		
		int n1 = 0;
		int n2 = 1;
		System.out.print(n1+"\t" +n2+ "\t");
		sc.close();
		
		for (int i = 2; i < count; i++) {
			
			int n3 = n1 + n2;
			System.out.print( n3+ "\t");
			n1 = n2;
			n2 = n3;
			
		}
	
		
	}

}
