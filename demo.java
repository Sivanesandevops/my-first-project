package com;

import java.util.Scanner;

public class Solution {
	
	public static void main (String args[]) {
		
		
		Calculator calc = new Calculator();
		
		Scanner scanner = new Scanner(System.in);
		
		int sum = calc.sum(10,20);
		int substract = calc.substract(20,40);
		int multiply = calc.multiply(30,10);
		int divide = calc.divide(10,5);
		
		System.out.println(" sum is " + sum);
		System.out.println(" substract is " + substract);
		System.out.println(" multiply is " + multiply);
		System.out.println(" divide is " + divide);
			
		}
	}



