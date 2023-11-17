package com.ashwini.ashu;

import java.util.List;
import java.util.LinkedList;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

public class StringArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1[] = {"ABC","XYZ","MNO","PQR","ABD"};
		//s1[0]="ABC";
		System.out.println(s1.length);
		
		//LHS =RHS
		//LHS -> Interface refvar or SuperClass refcar
		
		List<String> list = new LinkedList<String>();
		list.add("ABC");
		list.add("ABC");
		list.add("DEF");
		System.out.println("number of elements in the list is:::" + list.size());
		System.out.println(list.get(0));
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
			
		}
			
         Set<String> set = new HashSet<String>();
         set.add("ABC");
         set.add("ABC");
         set.add("DEF");
         System.out.println("number of elements in the set is" + set.size());
         //for each String object stored in set , fetch and store in variable s and print in for loop
         System.out.println("Printing the values via for each loop");
         for(String s : set)   // for each loop
         {
        	 System.out.println(s);
         
	}
         System.out.println("Printing the values via iterator");
         Iterator<String> it = set.iterator();
         while(it.hasNext())
         {
        	 System.out.println(it.next());
         }
}
}
