/**
 * Copyright (c) 2021.
 *
 * @author Tochie
 *
 * PROBLEM STATEMENT : Given an array of Intervals sorted by their start time, merge them into nonoverlapping intervals.
 * e.g:
 * input: (1,3), (5,10), (9,31), (12,30)
 * output: (1,3), (5,31)
 *
 * RUNNING TIME COMPLEXITY:
 * O(N)
 * SPACE COMPLEXITY:
 * O(1)
 *
 * Date 9/10/21, 12:04 AM
 */

package com.samples;



import java.util.ArrayList;
import java.util.List;

public class SortedArrayInterval {


    public static void main(String[] args) {

        Interval i1 = new Interval(3,5);
        Interval i2 = new Interval(7,5);
        Interval i3 = new Interval(3,14);
        Interval i4 = new Interval(8,50);
        Interval i5 = new Interval(13,5);

        List<Interval> intervals = new ArrayList<>();
        intervals.add(i1);
        intervals.add(i2);
        intervals.add(i3);
        intervals.add(i4);
        intervals.add(i5);

        mergeIntervals(intervals);

        System.out.println(mergeIntervals(intervals));
    }

    static class Interval {
        public int start, end;

        @Override
        public String toString() {
            return "Interval{" +
                    "start=" + start +
                    ", end=" + end +
                    '}';
        }

        public Interval(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }

    public static List<Interval> mergeIntervals(List<Interval> in) {
        if (in == null || in.size() == 0) {
            return null;
        }
        List<Interval> solution = new ArrayList<Interval>();
        Interval last = in.get(0);
        solution.add(last);

        for (int i = 1; i < in.size(); i++) {

            Interval current = in.get(i);

            if (current.start > last.end) {
                solution.add(current);
                last = current;
            } else {
                last.end = Math.max(last.end, current.end);
            }
        }
        return solution;
    }
}
