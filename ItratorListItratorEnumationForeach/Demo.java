package com.ItratorListItratorEnumationForeach;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class Demo {

	public static void main(String[] args) {

//		Vector<Integer> v = new Vector<Integer>();
//
//		v.add(1);
//		v.add(2);
//		v.add(3);
//		v.add(4);
//		v.add(5);

//Q1.Print 5 element in list
//		
//		System.out.println(v);
//		

		List<Integer> list = new ArrayList<Integer>();

		list.add(11);
		list.add(12);
		list.add(13);
		list.add(14);
		list.add(15);
//
//		list1.addAll(list);
//
//		System.out.println(list);

//		1.ForEach

//		for (Integer integer : list) {
//			System.out.println(integer);
//		}

//		2.Itrator

//		Iterator<Integer> itr = list.iterator();
//
//		while (itr.hasNext()) {
//			System.out.println(itr.next());
//		}

//		3.ListIterator

//		ListIterator<Integer> litr = list.listIterator();
//
//		while (litr.hasNext()) {
//			System.out.println(litr.next());
//		}

//		4.Enumration
//		not allowed

//		Vector
//itrator
//		Iterator<Integer> itr = list.iterator();
//
//		while (itr.hasNext()) {
//			System.out.println(itr.next());
//		}
//listitrator		
//		ListIterator<Integer> litr = list.listIterator();
//
//		while (litr.hasNext()) {
//			System.out.println(litr.next());
//		}

//foreach

//		for (Integer integer : list) {
//			System.out.println(integer);
//		}

//enumration

//		Enumeration<Integer> e = new v.elements();
//		while (e.hasMoreElements()) {
//			System.out.println(e.nextElement());
//		}

//Q2.Write a Java program to add, update, and remove elements from a List.

//		v.set(0, 0);
//
//		System.out.println(v);
//
//		v.remove(0);
//
//		System.out.println(v);

//		foreach

//		for (Integer integer : v) {
//			System.out.println(integer);
//		}

//		itrator

//		Iterator<Integer> itr = v.iterator();
//
//		while (itr.hasNext()) {
//			System.out.println(itr.next());
//		}

//		ListItrator

//		ListIterator<Integer> litr = v.listIterator();
//
//		while (litr.hasNext()) {
//			System.out.println(litr.next());
//		}

//		Q3.Find the size of a list and print 1st & last Element

//		list.size();
//
//		System.out.println(list);
//
//		list.addFirst(100);
//
//		list.getFirst();
//
//		System.out.println(list);
//
//		list.getLast();
//
//		list.addLast(200);
//
//		System.out.println(list);

		// Q4.Check whether a given element exist in a list or not

//		System.out.println(list);
//
//		if (list.contains(1)) {
//			System.out.println("Present in List");
//		} else {
//			System.err.println("Absent");
//		}

		// Q5.Sort a list of integer in ascending order
//
//		list.add(1);
//		list.add(100);
//		list.add(34);
//		list.add(56);
//		list.add(78);
//
//		list.sort(null);
//
//		System.out.println(list);

		// Q6.Remove Duplicates Elements From list

//		ArrayList list2 = new ArrayList();
//
//		list2.add(1);
//		list2.add(10);
//		list2.add(100);
//		list2.add(1);
//		list2.add(1);

//		System.out.println(list);
//
//		System.out.println(list2);
//
//		System.out.println(list.equals(list2));
//
//		list2.parallelStream();
//
//		System.out.println(list2);
//		if (list2.parallelStream() != null) {
//			System.out.println("Duplicates");
//		} else {
//			System.out.println("Not Duplicates");
//		}
//		System.out.println("After Remove Duplicates List" + list2.parallelStream());

//		 Q7.Reverse Elements of list

//		System.out.println(list);
//
//		System.out.println(list.reversed());

//		 Q8.Copy all Elements from one list to another list

//		ArrayList list2 = new ArrayList();

//		list2.add(23);
//		list2.add(45);
//		list2.add(56);
//		list2.add(45);
//		list2.add(45);
//
//		list2.addAll(list);
//
//		System.out.println(list2);

//		Q9.Convert a list into an Array and print the Array Element

//		ArrayList list2 = new ArrayList();

//		list2.add(1);
//		list2.add(10);
//		list2.add(13);
//		list2.add(15);
//		list2.add(41);
//
//		list2.toArray();
//
//		System.out.println(list2);

//				
//		Q10.Clear a List

//		list.clear();
//
//		System.out.println(list);

	}

}
