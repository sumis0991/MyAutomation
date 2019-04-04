package com.algorithm;

import java.util.Scanner;

public class Fibochini {

			public static void main(String[] args) {
				
				Scanner ss =new Scanner(System.in);
				System.out.println("enter a value");
				int v=ss.nextInt();
						
				int a= 0;
				int b= 1;
				int fibo;
				
				for (int i=3;i<v;i++) {
					fibo =a+b;
					a=b;
					b=fibo;
					System.out.println(fibo);
				
				
				}
	}

}
