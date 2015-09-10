package com.datametica.test;

import java.util.Scanner;


public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter i:");
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		for (int i=0 ;i<n;i++){
			for(int k=n-i-1;k>0;k--)
				System.out.print("-");
			for(int j=0;j<=i;j++)
				System.out.print("*");
			System.out.println();
		}

	}

}
