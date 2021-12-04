package com.bl.logical;

import java.util.Scanner;

public class PerfectNumber {
	public static void main(String[] args) {
		System.out.println("Enter The Number = ");
		Scanner sc = new Scanner(System.in);
		 int n = sc.nextInt();
		 int sum = 0;
		 int i = 1;
		 while ( i <= n/2) {
			 if (n % i == 0) {
				sum = sum + i;
			 }
			 i++;
		 }
		 if (sum == n) {
			 System.out.println(n+ " This is the Perfect Number");
		 }else {
		 System.out.println(n+ " This is Not the Perfect Number");
		 }
	}
}
