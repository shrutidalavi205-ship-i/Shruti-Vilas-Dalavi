package com.ItratorListItratorEnumationForeach;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class Demo {

	public static void main(String[] args) {

		Vector<Integer> v = new Vector<Integer>();

		v.add(1);
		v.add(2);
		v.add(3);
		v.add(4);
		v.add(5);

//Q1.Print 5 element in list
//		
		System.out.println(v);
//		

//		List<Integer> list1 = new ArrayList<Integer>();
//
//		list1.add(11);
//		list1.add(12);
//		list1.add(13);
//		list1.add(14);
//		list1.add(15);
//
//		list1.addAll(list);
//
//		System.out.println(list1);

//		1.ForEach

//		for (Integer integer : list1) {
//			System.out.println(integer);
//		}

//		2.Itrator

//		Iterator<Integer> itr = list1.iterator();
//
//		while (itr.hasNext()) {
//			System.out.println(itr.next());
//		}

//		3.ListIterator

//		ListIterator<Integer> litr = list1.listIterator();
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

	}

}
