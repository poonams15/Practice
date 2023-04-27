package com.poonam.practice;

public class Demo1 {
public static void main(String[] args) {
		
		try
		{
			System.out.println("0");
			int i1= 10/2;
			System.out.println("1");
			int i= 10/0;
			}
		catch (NullPointerException e) {
			System.out.println("2");
			e.getMessage();
			try {
				System.out.println("3");
				int i= 20/0;
			}
			catch (Exception e1) {
				System.out.println("4");
				e1.printStackTrace();
				
			}
		}
		
	}

}
