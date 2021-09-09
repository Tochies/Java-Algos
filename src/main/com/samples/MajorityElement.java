package com.samples;


import com.utils.Utils;

import java.util.Arrays;

/**
 * Copyright (c) 2021.
 * @author Tochie
 *
 * PROBLEM STATEMENT : Find the majority element. In this problem, majority element is defined as the
 * number that appears more than n/2 times in an array of numbers.
 * e.g:
 * input: 3,2,2,1,2,2,1
 * output: 2
 *
 * SOURCE TYPE : Coding Interview Ninja
 *
 * SOLUTION WEAKNESS : This solution will only work fine if the major element appears sequentially at the end of the array
 * by default, it retuns the major value with the count when the ::findMajCandidate loop ends
 *
 */
public class MajorityElement {

    public static void main(String[] args) {


        runTests();

    }


    public static void runTests(){

        int[] arr = Utils.generateRandomNumberArray(8, 1, 3);

        System.out.println(Arrays.toString(arr));

        int maj = findMajCandidate(arr);
        if (maj == Integer.MIN_VALUE || !verifyMajCandidate(arr, maj)) {
            System.out.println("No majority element found.");
        } else {
            System.out.println("Majority element: " + maj);
        }
    }

    /*
    This method takes an array and compares each element in that array to the next element
    it stores the last array element as :maj and the number of appearances as :count
    it reduces the count by 1 if the next element is not the same as :maj
    it returns the value of :maj as the major element
     */
    public static int findMajCandidate(int[] arr) {

      // TODO : optimize this code to return the major value regardless of the position it appears in the array

        if (arr == null || arr.length == 0) {
            return Integer.MIN_VALUE;
        }

        int count = 1;
        int maj = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == maj) {
                count++;
            } else {
                count--;
            }
            if (count == 0) {
                maj = arr[i];
                count = 1;
            }
        }
        return maj;
    }

    /*
    This method checks the value returned by ::findMajCandidate
    loops through the array to see if the count of major value equals half of the array length
    returns true if it does
     */
    public static boolean verifyMajCandidate(int[] arr, int maj) {
        if (arr == null || arr.length == 0) {
            return false;
        }
        int n = arr.length, count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == maj) {
                count++;}
            if (count > n / 2) {
                return true;
            } }
        return false;
    }

}
