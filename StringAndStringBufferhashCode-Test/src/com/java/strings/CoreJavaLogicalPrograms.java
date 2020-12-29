package com.java.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import java.util.function.Consumer;

public class CoreJavaLogicalPrograms {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

//		Pattern p = Pattern.compile ("[!@#$%&*()_+=|<>?{}\\[\\]~-][0-9][a-zA-z]");
//		Matcher m = p.matcher("I am a string");
//		boolean b = m.find();
//
//		if (b)
//		   System.out.println("There is a special character in my string");

		/*
		 * long t1, t2; List<Employee> eList = new ArrayList<Employee>(); eList.add(new
		 * Employee("A", 20000)); eList.add(new Employee("B", 3000)); eList.add(new
		 * Employee("C", 15002)); eList.add(new Employee("D", 7856)); eList.add(new
		 * Employee("E", 200)); eList.add(new Employee("F", 50000));
		 * 
		 * t1 = System.currentTimeMillis();
		 * System.out.println("Sequential Stream Count?= " + eList.stream().filter(e ->
		 * e.getSalary() > 15000).count());
		 * 
		 * t2 = System.currentTimeMillis();
		 * System.out.println("Sequential Stream Time Taken?= " + (t2-t1) + "\n");
		 * 
		 * 
		 * t1 = System.currentTimeMillis();
		 * System.out.println("Parallel Stream Count?= " +
		 * eList.parallelStream().filter(e -> e.getSalary() > 15000).count());
		 * 
		 * t2 = System.currentTimeMillis();
		 * System.out.println("Parallel Stream Time Taken?= " + (t2-t1));
		 *****/

		ArrayList<String> names = new ArrayList<String>(Arrays.asList("A", "B", "C", "D"));

		// 1
		//names.forEach(x -> System.out.println(x.toLowerCase()));

		// 2
		Consumer<String> lambdaExpression = x -> System.out.println(x.toLowerCase());

		names.forEach(lambdaExpression);

		
		
		ArrayList<String> list1 = new ArrayList<>();    //list 1
        
        list1.add("A");
        list1.add("B");
        list1.add("A");
        list1.add("D");
        
       
        ArrayList<String> list2 = new ArrayList<>();    //list 2
         
        list2.add("E");
        list2.add("F");
        list1.addAll(list2);
         
        System.out.println(list1); 
        Consumer<String>   aaa=x->System.err.println("--->"+x);
        list1.forEach(aaa);
        Object clone = list1.clone();
        
        Consumer<String>   aaaa=x->System.err.println("-dd-->"+x);
        ((ArrayList<String>) clone).forEach(aaaa);
        
        
        
        
        
        
        
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(0,1,2,3,4,5,6,7,8,9));
        
        ArrayList<Integer> sublist = new ArrayList<Integer>( list.subList(2, 6) );
        
        
        System.out.println(sublist); 
        
        
        
        
        
        
        
        
        
        
	}
}
