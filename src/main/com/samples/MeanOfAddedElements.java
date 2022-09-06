/**
 * Copyright (c) 2021.
 *
 * @author Tochie
 *
 * PROBLEM STATEMENT : Design a class that you can add elements and find the mean of the last N
 * elements
 *
 * Date 9/9/21, 11:11 PM
 */

package com.samples;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class MeanOfAddedElements {

    ArrayList<Integer> mData = new ArrayList<Integer>();
    ArrayList<Integer> mDataSum = new ArrayList<Integer>();




    public static void main(String[] args){

        MeanOfAddedElements meanOfAddedElements = new MeanOfAddedElements();

        while (meanOfAddedElements.len() < 5){
            int n = ThreadLocalRandom.current().nextInt(1, 12);

            meanOfAddedElements.add(n);
            System.out.println(meanOfAddedElements.mData);

            System.out.println(meanOfAddedElements.mean(meanOfAddedElements.len()));
        }

       // System.out.println(n.nextInt());
    }

    public void add(int i) {


        mData.add(i);
        int lastIndex = mDataSum.size() - 1;
        int sum = i;
        if (lastIndex >= 0) {
            sum += mDataSum.get(lastIndex);
        }
        mDataSum.add(sum);
    }
    public float mean(int N) {
        if (N <= 0 || mDataSum.size()==0 || N > mDataSum.size()) {
            return -Float.MAX_VALUE;
        }
        int lastIndex = mDataSum.size() - 1;
        int firstIndex = Math.max(lastIndex - N, 0);
        float sum;
        sum = mDataSum.get(lastIndex)-mDataSum.get(firstIndex);
        return sum / N;
    }

    public int len(){
        return mData.size();
    }
}
