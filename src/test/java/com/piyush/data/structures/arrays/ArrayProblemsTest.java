package com.piyush.data.structures.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayProblemsTest {
    final ArrayProblems testObj = new ArrayProblems();

    @Test
    public void testMaxSubarraySum_Input_1(){
        int[] arr = new int[]{-1,-1,-1,-1};
        Assertions.assertEquals(-1, testObj.maxSubarraySum(arr, arr.length));
    }

    @Test
    public void testMaxSubarraySum_Input_2(){
        int[] arr = new int[]{-1,-1,0,-1};
        Assertions.assertEquals(0, testObj.maxSubarraySum(arr, arr.length));
    }

    @Test
    public void testMaxSubarraySum_Input_3(){
        int arr[] = new int[]{2, 3, -1, -20, 5, 10};
        Assertions.assertEquals(15, testObj.maxSubarraySum(arr, arr.length));
    }

    @Test
    public void testIsStringWithBalancedParantheses(){
        Assertions.assertTrue(testObj.isStringWithBalancedParantheses("((()))"));
        Assertions.assertTrue(testObj.isStringWithBalancedParantheses("(s(s(s)s)stft)"));
        Assertions.assertFalse(testObj.isStringWithBalancedParantheses("("));
        Assertions.assertFalse(testObj.isStringWithBalancedParantheses("({}"));
        Assertions.assertFalse(testObj.isStringWithBalancedParantheses("[{}"));
        Assertions.assertFalse(testObj.isStringWithBalancedParantheses("}"));
        Assertions.assertFalse(testObj.isStringWithBalancedParantheses("{}]"));
    }

    @Test
    public void testIsStringWithBalancedParantheses_Empty_Or_Null_String(){
        Assertions.assertFalse(testObj.isStringWithBalancedParantheses(""));
        Assertions.assertFalse(testObj.isStringWithBalancedParantheses(null));
    }
}
