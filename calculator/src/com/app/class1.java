package com.app;

public class class1 implements HomeService
{
     public void Addition(int first,int second,int third)
     {
    	 int result=first+second+third;
    	 System.out.println("Addition is:"+ result);
     }
     public void Substraction(int first,int second,int third)
     {
    	 int result=first-second-third;
    	 System.out.println("Substraction is:"+ result);
     }
     public void Multiplication(int first,int second,int third)
     {
    	 int result=first*second*third;
    	 System.out.println("Multiplication is:"+ result);
     }
     public void Division(int first,int second,int third)
     {
    	 int result=first/second/third;
    	 System.out.println("Division is:"+ result);
     }
     
     
}
