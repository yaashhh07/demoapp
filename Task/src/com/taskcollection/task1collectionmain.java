package com.taskcollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class task1collectionmain {
    public static void main(String[] args) {
		List<String> l1=new ArrayList<>();
		   l1.add("Pune");
		   l1.add("Mumbai");
		List<String> l2=new ArrayList<>();
		   l2.add("Indore");
		   l2.add("Bhopal");
		List<String> l3=new ArrayList<>();
		   l3.add("Agra");
		   l3.add("Allahabad");
	    List<List<String>> India=new ArrayList<List<String>>();
	        India.add(l1);
	        India.add(l2);
	        India.add(l3);
	    List<List<List<String>>> World=new ArrayList<List<List<String>>>();
	        World.add(India);
	        System.out.println(World);
//	    Iterator<List<List<String>>> itr=World.iterator();
//	        while(itr.hasNext())
//	        {
//	        	List<List<String>> s1=itr.next();
//	        	Iterator<List<String>> I11=s1.iterator();
//	        	   while(I11.hasNext()) {
//	        		   List<String> s2=I11.next();
//	        		   Iterator<String> I22=s2.iterator();
//	        		      while(I22.hasNext()) {
//	        		    	  String s=I22.next();
//	        		    	  System.out.println(s);
//	        		      }
//	        	   }
//	        }
	        
	        
	        World.forEach((lls)->
	        {
	        	System.out.println(lls);
	        	lls.forEach((ls)->
	        	{
	        	System.out.println(ls);
	        	ls.forEach((s)->{
	        		System.out.println(s);
	        	});
	        	});
	        });
	        
	}
   	
	
}
