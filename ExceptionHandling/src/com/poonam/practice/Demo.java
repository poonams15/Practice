package com.poonam.practice;

public class Demo {
	public static void main(String[] args) {
		
		try {
			int a=10/0;
			System.out.println("This is try block");
		}catch(ArithmeticException e1) {
			System.out.println(" This is  1st catch block ");
			e1.toString();
			
		}catch(Exception e) {
			System.out.println("This is 2nd catch block");
		}
	}

}
