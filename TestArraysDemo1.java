package method.reference.demos;

import java.util.Arrays;

public class TestArraysDemo1 {

	public static void main(String[] args) {

		int[] a= {1,78,90,34,5,7};
		
		/*
		 * Arrays is predefined utility class which resides inside
		 * java.util package
		 * 
		 * This class provides lots of static methods like
		 * static void sort(T[] arrayObj)
		 * static void toString(T[] obj)
		 * static T[] copyOf(T[] orginalAryyay,length_of_array)
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		System.out.println(a);
		//static void sort(T[] obj)
		Arrays.sort(a);
	int key=	Arrays.binarySearch(a, 90);
	System.out.println(key);	
		
		System.out.println("after sorting"+ " "
		+Arrays.toString(a));
	//static T[] copyOf(original_array,int newlength)
		int[] resultArray=	Arrays.copyOf(a, 3);
	System.out.println("after copying"+ " "
		+Arrays.toString(resultArray));	
	//static T[] copyOfRanger(original_array,int fromIndex, int lastLimit)
	int[] cpyRange=	Arrays.copyOfRange(a, 2, a.length);
	System.out.println(Arrays.toString(cpyRange));	
	//static void fill(Original array, value)
	Arrays.fill(a, 0);
	System.out.println(Arrays.toString(a));
	//static void fill(original_array,int fromIndex, int toIndex, int elemment)
	Arrays.fill(a,3,6,9);
	System.out.println(Arrays.toString(a));
	
		

		
		

	}

}
