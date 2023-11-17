package com.ashwini.ashu;

public class Calculator {
	
	
	int a;
	int b;
	public void addition()
	{
		System.out.println(a+b);
	}
	public void subtract()
	{
		System.out.println(a-b);
		
	}
	public void multiply()
	{
		System.out.println(a*b);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator c1 =new Calculator();
		c1.a=3;
		c1.b=5;
		c1.addition();
		
		Calculator c2 =new Calculator();
		c2.a=10;
		c2.b=5;
		c2.subtract();
		
		Calculator c3 =new Calculator();
		c3.a=5;
		c3.b=5;
		c3.multiply();
		
	}

}
