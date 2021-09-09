/**
 * Copyright (c) 2021.
 *
 * @author Tochie
 *
 * PROBLEM STATEMENT : Find the maximum sum of a continuous subsequence in an array of integers.
 * e.g:
 * input: 1,-3,2,5,-8
 * output: 7
 *
 * SOURCE TYPE : Coding Interview Ninja
 *
 *
 * Date 9/9/21, 9:21 PM
 */

package com.samples;

import com.utils.Utils;

import java.util.Arrays;

public class MaximumContinuousSum {

    public static void main(String[] args) {

        int[] ints = Utils.generateRandomNumberArray(5, -5, 5);
        System.out.println(Arrays.toString(ints));

        System.out.println(maxSubSequence(ints));
    }



    /*
    This method compares an array against two values,
    the maximum value so far and the current value + the next value
    the maximum between the current value and the max so far becomes the solution
     */
    public static int maxSubSequence(int[] arr) {
        if (arr == null || arr.length == 0) {
            return Integer.MIN_VALUE;
        }

        int maxSoFar = arr[0];
        int curMax = arr[0];

        for (int i = 1; i < arr.length; i++) {

            curMax = Math.max(curMax + arr[i], arr[i]);
            maxSoFar = Math.max(curMax, maxSoFar);
        }

        return maxSoFar;
    }


}
