package com.nice.piyush.searching;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.util.Arrays;

public class BinarySearchTest {
    @Test
    public void whenEmptyArrayThenReturnMinusOne() {
        int[] arr = new int[]{};

        Assertions.assertEquals(-1, BinarySearchImpl.binarySearch(5, arr));
        Assertions.assertEquals(-1, BinarySearchImpl.search(5, 0, arr.length - 1, arr));

    }

    @Test
    public void whenArbitraryArrayThenReturnAppropriateIndex_Input_Set_1() {
        final int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};

        Assertions.assertEquals(3, BinarySearchImpl.binarySearch(4, arr));
        Assertions.assertEquals(3, BinarySearchImpl.search(4, 0, arr.length - 1, arr));

    }

    @Test
    public void whenArbitraryArrayThenReturnAppropriateIndex_Input_Set_2() {
        final int[] arr = new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 4, 4, 4, 4, 4, 4,};

        Assertions.assertEquals(9, BinarySearchImpl.binarySearch(2, arr));
        Assertions.assertEquals(9, BinarySearchImpl.search(2, 0, arr.length - 1, arr));

    }

    @Test
    public void whenArbitraryArrayThenReturnAppropriateIndex_Input_Set_3() {
        final int[] arr = new int[]{1, 2, 3, 4, 5, 6, 6, 6, 6, 6, 6, 7, 7, 8, 8, 8, 9, 9};

        Assertions.assertEquals(16, BinarySearchImpl.binarySearch(9, arr));
        Assertions.assertEquals(16, BinarySearchImpl.search(9, 0, arr.length - 1, arr));

    }

    @Test
    public void whenArbitraryArrayThenReturnAppropriateIndex_Input_Set_4() {
        final int[] arr = new int[]{1, 1};

        Assertions.assertEquals(0, BinarySearchImpl.binarySearch(1, arr));
        Assertions.assertEquals(0, BinarySearchImpl.search(1, 0, arr.length - 1, arr));
    }

    @Test
    public void whenArbitraryArrayThenReturnAppropriateIndex_Input_Set_5() {
        final int[] arr = new int[]{1};

        Assertions.assertEquals(0, BinarySearchImpl.binarySearch(1, arr));
        Assertions.assertEquals(0, BinarySearchImpl.search(1, 0, arr.length - 1, arr));
    }

    @Test
    public void testStringReverse(){
        Assertions.assertEquals("", BinarySearchImpl.rev(""));
        Assertions.assertEquals("hsuyip", BinarySearchImpl.rev("piyush"));
        Assertions.assertEquals("mom", BinarySearchImpl.rev("mom"));
        Assertions.assertEquals(null, BinarySearchImpl.rev(null));
        Assertions.assertEquals("mom", BinarySearchImpl.reverse("mom"));
    }

    @Test
    public void testSortBinaryArrayOneElement(){
        Assertions.assertTrue(Arrays.equals(new int[]{1}, BinarySearchImpl.sortBinaryArray(new int[]{1})));
        Assertions.assertTrue(Arrays.equals(new int[]{0},  BinarySearchImpl.sortBinaryArray(new int[]{0})));
    }

    @Test
    public void testSortBinaryArrayTwoElement(){
        Assertions.assertTrue(Arrays.equals(new int[]{0,1},  BinarySearchImpl.sortBinaryArray(new int[]{0,1})));
        Assertions.assertTrue(Arrays.equals(new int[]{0,1},  BinarySearchImpl.sortBinaryArray(new int[]{1,0})));
    }

    @Test
    public void testSortBinaryArrayEmptyArray(){
        Assertions.assertTrue(Arrays.equals(new int[]{},  BinarySearchImpl.sortBinaryArray(new int[]{})));
    }

    @Test
    public void testSortBinaryArrayNullArray(){
        Assertions.assertEquals(null,  BinarySearchImpl.sortBinaryArray(null));
    }

    // Tests for largest binary gap.
    @Test
    public void testBinaryRep(){
        Assertions.assertEquals(1, BinarySearchImpl.longestBinaryGap(5));
        Assertions.assertEquals(1, BinarySearchImpl.longestBinaryGap(10));
        Assertions.assertEquals(3, BinarySearchImpl.longestBinaryGap(17));
        Assertions.assertEquals(1, BinarySearchImpl.longestBinaryGap(20));
        Assertions.assertEquals(2, BinarySearchImpl.longestBinaryGap(5555));
    }

    @Test
    public void testPrintAllBinaryGaps(){
        int[] inputs = new int[]{36,
                37,
                33,
                32,
                47,
                63,
                62,
                60,
                572,
                1020};

        for (int i:
                inputs) {
            BinarySearchImpl.printAllBinaryGaps(i);
        }
    }
}
