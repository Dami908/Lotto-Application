package emmanuel_Ajayi_sec008_exercise3;

import java.util.Arrays;

public class SortNumbersTest {

	public static void main(String[] args) {
		
		int[] numbers= {2,3,4,5,5,4,5};//returns variable number of arguments
		System.out.println("Unsorted Aray"+Arrays.toString(numbers));//print out the unsorted array
		SortNumbers.SortNumbers1(numbers);sorts the numbers
		
		int[] numbers1= {25,67,89,90,25,67,90};
		System.out.println("\nUnsorted Aray"+Arrays.toString(numbers1));
		SortNumbers.SortNumbers1(numbers1);
		
		int[] numbers2= {101,670,894,909,25,67,90};
		System.out.println("\nUnsorted Aray"+Arrays.toString(numbers2));
		SortNumbers.SortNumbers1(numbers2);
		
		
	}

}
