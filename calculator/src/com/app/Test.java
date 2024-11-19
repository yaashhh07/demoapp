package com.app;

public class Test {
	int a;
   public static void main(String[] args) 
   {
	   Numbers num=new Numbers();
	   num.setFirst(10);
	   int n1=num.getFirst();
	   
	   num.setSecond(5);
	   int n2=num.getSecond();
	   
	   num.setThird(2);
	   int n3=num.getThird();
	   
	   class1 operation=new class1()
	    {
		   
	    };
	    operation.Addition(10, 5, 2);
	    operation.Substraction(10, 5, 2);
	    operation.Multiplication(10, 5, 2);
	    operation.Division(10, 5, 2);
	    
   }
}
