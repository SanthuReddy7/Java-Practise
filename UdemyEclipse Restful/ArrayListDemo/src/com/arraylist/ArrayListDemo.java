package com.arraylist;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
		System.out.println("initial size of arraylist ="+a.size());
		a.add("C");
		a.add("A");
		a.add("D");
		a.add("B");
		a.add("N");
		a.add("C");
		a.add("X");
		System.out.println("after adding size of arraylist ="+a.size());
		a.remove(0);
		System.out.println("after removing size ="+a.size());a.add("C");
	}
}
