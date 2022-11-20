package _02_Intro_To_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _03_SearchTest {

    /*
     *  A minimum of 3 tests are required for each method
     */

    @Test
    public void testLinearSearch() {
        // 1. Use the assertEquals() method to test your linear search method
    	String[] array1 = {"Apple", "Grape", "Strawberry", "Lemon", "Lime"};
        assertEquals(3, _01_LinearSearch.linearSearch(array1, "Lemon"));
        assertEquals(1, _01_LinearSearch.linearSearch(array1, "Grape"));
        assertEquals(4, _01_LinearSearch.linearSearch(array1, "Lime"));
        assertEquals(-1, _01_LinearSearch.linearSearch(array1, "Pineaple"));
        
         String[] array2 = {"Red", "Green", "Purple", "Black", "Orange"};
        assertEquals(0, _01_LinearSearch.linearSearch(array2, "Red"));
        assertEquals(4, _01_LinearSearch.linearSearch(array2, "Orange"));
        assertEquals(2, _01_LinearSearch.linearSearch(array2, "Purple"));
        assertEquals(-1, _01_LinearSearch.linearSearch(array2, "Gold"));

    }

    @Test
    public void testBinarySearch() {
        // 2. Use the assertEquals() method to test your binary search method
        //    remember that the array must be sorted
//		{0, 1, 2, 3, 4}
 int[] array1 = {1, 2, 5, 8, 9};
assertEquals(1, _02_BinarySearch.binarySearch(array1, 0, array1.length-1, 2));
assertEquals(4, _02_BinarySearch.binarySearch(array1, 0, array1.length-1, 9));
assertEquals(2, _02_BinarySearch.binarySearch(array1, 0, array1.length-1, 5));
assertEquals(-1, _02_BinarySearch.binarySearch(array1, 0, array1.length-1, 3));

//				{ 0,  1,  2,  3,  4}
 int[] array2 = {18, 21, 32, 53, 72};
assertEquals(4, _02_BinarySearch.binarySearch(array2, 0, array1.length-1, 72));
assertEquals(3, _02_BinarySearch.binarySearch(array2, 0, array1.length-1, 53));
assertEquals(1, _02_BinarySearch.binarySearch(array2, 0, array1.length-1, 21));
assertEquals(-1, _02_BinarySearch.binarySearch(array2, 0, array1.length-1, 99));

    }
}
