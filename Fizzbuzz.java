package com.basic.pkg;

public class Fizzbuzz {

	public static void main(String[] args) {
		int num=1;
		while(num<=50)
		{
			if(num%3==0 && num%5==0)
			{
				System.out.println("Fizz Buzz");		
			}
			else if(num%5==0) {
				
				System.out.println("Buzz ");
			}
			else if(num%3==0) {
				
				System.out.println("Fizz ");
			}
			else 
			{
				System.out.println(num);
			}
			num=num+1;			
			
		}
		// TODO Auto-generated method stub

	}

}
