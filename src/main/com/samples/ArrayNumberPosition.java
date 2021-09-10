/**
 * Copyright (c) 2021.
 *
 * @author Tochie
 *
 * PROBLEM STATEMENT : Given an array of sorted integers find the position of a given number, if
 * exists.
 * e.g:
 * input:
 * array: 2, 4, 5, 7, 8
 * num: 4
 * output: 1
 *
 * Date 9/10/21, 12:30 AM
 */

package com.samples;

import com.utils.Utils;

import java.util.Arrays;

public class ArrayNumberPosition {

    public static void main(String[] args) {
        System.out.println(binarySearch(Utils.generateSortedRandomNumberArray(5, 1, 5), 5));
    }

    public static int binarySearch(int[] arr, int num) {
        System.out.println(Arrays.toString(arr));
        if (arr == null) {
            return Integer.MIN_VALUE;
        }
        int st = 0;
        int end = arr.length - 1;

        while (st <= end) {
            int mid = (st + end) / 2; // array length + start
            if (arr[mid] == num) {      //
                return mid;
            } else if (num > arr[mid]) {
                st = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return Integer.MIN_VALUE; }

}
