package Practice1D;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Array {

	public static void main(String[] args) {

		int[] a = { 23, 56, 76, 45, 89, 96, 43 };

//Q1.Declare & Initialize 1D Array

//		Arrays.sort(a);
//		
//		System.out.println(Arrays.toString(a));

//Q2.Print All Elements

//		System.out.println(Arrays.toString(a));

//Q3.Find the Length

//		System.out.println(a.length);

//Q4.Sum of All Elements

//		System.out.println(Arrays.toString(a));
//
//		int sum = Arrays.stream(a).sum();
//
//		System.out.println("Sum of the all Elements are = " + sum);

//Q5.Find the Average of Elements

//		double avg = Arrays.stream(a).average().getAsDouble();
//		System.out.println("Average of All Elements = " + avg);

//Q6.Find the maximum element 

//		int max = Arrays.stream(a).max().getAsInt();
//		System.out.println("Maximum Element = " + max);

//Q7.Find the minimum element

//		int min = Arrays.stream(a).min().getAsInt();
//		System.out.println("Maximum Element = " + min);

//Q8.Search the Element

//		int key = 56;
//
//		int search = Arrays.binarySearch(a, key);
//
//		if (search >= 0) {
//			System.out.println(key + " Found the Element at index " + search);
//		} else {
//			System.out.println("Not Fount");
//		}

//Q9.Count Even & Odd Numbers

//		long evenCount = Arrays.stream(a).filter(n -> n % 2 == 0).count();
//
//		long oddCount = Arrays.stream(a).filter(n -> n % 2 == 1).count();
//
//		System.out.println("Even Numbers = " + evenCount);
//
//		System.out.println("Odd Numbers = " + oddCount);

//Q10.Copy Elements from one Array to Another

//		int[] a2 = Arrays.copyOf(a, a.length);
//
//		System.out.println(Arrays.toString(a));
//		System.out.println(Arrays.toString(a2));

//Q11.Reverse Elements
//		Integer[] arr = { 23, 56, 78, 54, 67 };
//		
//		List<Integer> list = Arrays.asList(arr);
//		
//		Collections.reverse(list);
//		
//		System.out.println(list);

//Q12.Sort a 1D Array in Ascending Order

//		System.out.println(Arrays.toString(a));
//		Arrays.sort(a);
//		System.out.println(Arrays.toString(a));

//Q13.Sort a 1D Array in Descending Order	
//		Integer[] arr = { 34, 6, 24, 87, 9, 88 };
//		System.out.println(Arrays.toString(arr));
//		Arrays.sort(arr);
//		System.out.println(Arrays.toString(arr));

//Q14.Find Duplicate Elements

//		Integer[] arr = { 34, 5, 76, 56, 34, 67, 76 };
//
//		System.out.println(Arrays.toString(arr));
//
//		Arrays.sort(arr);
//
//		System.out.println("Duplicate Elements are = ");
//
//		for (int i = 0; i < arr.length - 1; i++) {
//			if (arr[i].equals(arr[i + 1])) {
//				System.out.println(arr[i]);
//			}
//		}

//Q15.Remove Duplicates Elements

//		Integer[] arr = { 34, 5, 76, 56, 34, 67, 76 };
//
//		System.out.println(Arrays.toString(arr));
//
//		Integer[] a1 = Arrays.stream(arr).distinct().toArray(Integer[]::new);
//
//		System.out.println("Arrays after removing Duplicates = ");
//
//		System.out.println(Arrays.toString(a1));

//Q16.Count Frequency of Each Element

//		System.out.println("Count Frequency of Each Element");

//Q17.Find the Second Largest Element

//		Arrays.sort(a);
//
//		int sl=a[a.length-2];
//		
//		System.out.println("Second Largest Element = " + sl);

//Q18.Find the Second Smallest Element

//		Arrays.sort(a);
//
//		System.out.println("Second Smallest Element = " + a[1]);

//Q19.Merge Two 1D Arrays
		
//		int[] arr = {45,77,56,89};
//		
//		int[]merged = new int[a.length + arr.length];
//		
//        System.arraycopy(a, 0, merged, 0, a.length);
//        
//        System.arraycopy(arr, 0, merged, a.length, arr.length);
//
//
//		System.out.println(Arrays.toString(merged));
		
//Q20.Check Whether a 1D Array is a Palindrome				
		
		int[] arr= {12,45,65,45,12};
		int[] rev =arr.clone();
		
		for(int i=0; i<rev.length/2;i++) {
			int temp=rev[i];
			rev[i]=rev[rev.length-1-i];
			rev[rev.length-1-i]=temp;
		}
		if (Arrays.equals(arr, rev)) {
            System.out.println("Array is Palindrome");
        } else {
            System.out.println("Array is Not Palindrome");
        }

	}
}
