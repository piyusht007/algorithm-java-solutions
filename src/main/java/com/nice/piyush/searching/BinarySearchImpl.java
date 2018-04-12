package com.nice.piyush.searching;

import java.util.ArrayList;
import java.util.List;

public class BinarySearchImpl {
    public static int binarySearch(int num, int arr[]) {
        if (arr.length == 0) {
            return -1;
        }

        // Search
        int beg = 0;
        int end = arr.length - 1;

        while (beg <= end) {
            int middle = (beg + end) / 2;

            if (num == arr[middle]) {
                System.out.println("Found At: " + middle);
                return middle;
            }

            if (num < arr[middle]) {
                // Left sublist
                end = middle - 1;
                continue;
            }

            if (num > arr[middle]) {
                // Right sublist
                beg = middle + 1;
                continue;
            }
        }

        return -1;
    }

    public static int search(int num, int beg, int end, int arr[]) {
        if (arr.length == 0) {
            return -1;
        }

        int middle = (beg + end) / 2;

        if (num == arr[middle]) {
            return middle;
        } else if (num < arr[middle]) {
            return search(num, beg, middle - 1, arr);
        } else {
            return search(num, middle + 1, end, arr);
        }
    }

    public static String rev(String s) {
        if (s == null) {
            return s;
        }

        final char[] chars = new char[s.length()];

        for (int i = s.length() - 1, j = 0; i >= 0; i--, j++) {
            chars[j] = s.charAt(i);
        }

        return new String(chars);
    }

    public static String reverse(String s) {
        if (s.isEmpty()) {
            return s;
        }

        return reverse(s.substring(1)) + s.charAt(0);
    }

    public static int[] merge(int[] arr1, int[] arr2) {
        int len1 = arr1.length;
        int len2 = arr2.length;
        int[] arr3 = new int[len1 + len2];
        int i = 0, j = 0, k = 0;

        while (i < len1 && j < len2) {
            if (arr1[i] < arr2[j]) {
                arr3[k] = arr1[i];
                i++;
            } else {
                arr3[k] = arr2[j];
                j++;
            }

            k++;
        }

        while (i < len1) {
            arr3[k] = arr1[i];
            k++;
            i++;
        }

        while (j < len2) {
            arr3[k] = arr1[j];
            k++;
            j++;
        }

        return arr3;
    }

    public static int[] sortBinaryArray(int[] arr) {
        if (arr == null || arr.length == 0) {
            return arr;
        }

        int beg = 0;
        int end = arr.length - 1;

        while (beg < end) {
            if (arr[beg] == 0) {
                beg++;
            } else if (arr[end] == 1) {
                end--;
            } else {
                arr[beg] = 0;
                arr[end] = 1;
            }
        }

        return arr;
    }

    public static int longestBinaryGap(int n) {
        int currentGap = 0;
        int biggestGap = 0;

        // Remove trailing zeros.
        while (n % 2 == 0) {
            n /= 2;
        }

        for (int i = 0; n > 0; n /= 2) {
            if (n % 2 == 0) {
                // Bit 0
                currentGap++;
            } else {
                // Bit 1
                if (currentGap > biggestGap) {
                    biggestGap = currentGap;
                }

                currentGap = 0;
            }
        }

        return biggestGap;
    }

    public static void printAllBinaryGaps(int n) {
        final List<Integer> gaps = new ArrayList<>();
        int currentGap = 0;

        // Remove trailing zeros.
        while (n % 2 == 0) {
            n /= 2;
        }

        for (int i = 0; n > 0; n /= 2) {
            if (n % 2 > 0) {
                // Bit - 1.
                if (currentGap > 0) {
                    gaps.add(currentGap);
                }

                currentGap = 0;
            } else {
                // Bit - 0.
                currentGap++;
            }
        }

        if (!gaps.isEmpty()) {
            for (int i = gaps.size() - 1;
                 i >= 0;
                 i--) {
                System.out.print(gaps.get(i) + " ");
            }
        } else {
            System.out.print(0 + " ");
        }

        System.out.println();
    }
}
