package com.kodecamp.list;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MyList<T> {
	
	
	
	public  ArrayList<T> createList(T...numbers ) {
		ArrayList<T> list = new ArrayList<T>();
		for(T i:numbers) {
			list.add(i);
		}
		return list;
		
	}
	
	public void processItem(T item){
		System.out.println("processing item.");
		System.out.println(item);
		
	}
	
	public static void main(String args[]) {
		
		ArrayList<Integer> list = new MyList<Integer>().createList(1,2,3,4,5,6,7);
		ArrayList<String> list1 = new MyList<String>().createList("adf","fasd","fdf");
//		list.forEach( new List<Integer>()::processItem);
		
		list.stream()
		.filter((item)->item%2 == 0 ? true :false)
		.forEach(new MyList()::processItem);
		
		Integer total = list.stream().reduce(10,(a,b)->a+b);
	
		System.out.println("Total Value of List:"+total);
		
		
		List<Integer> list2 =  list.stream().map((item)->item*2).collect(Collectors.toList());
		
		list.stream().map((item)->item*2).forEach(System.out::println);
		
		
		
		
	}
	
	

}
