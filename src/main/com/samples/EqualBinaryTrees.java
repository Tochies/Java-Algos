/**
 * Copyright (c) 2021.
 *
 * @author Tochie
 *
 * PROBLEM STATEMENT : Given two binary trees find if they are equal (have the same content and
 * structure).
 *
 *
 * SOURCE TYPE : Coding Interview Ninja
 *
 * RUNNING TIME COMPLEXITY: O(N)
 * SPACE COMPLEXITY: O(1)
 *
 *
 * Date 9/9/21, 10:56 PM
 */

package com.samples;

import com.generic.TNode;

public class EqualBinaryTrees {

    public static void main(String[] args) {

    }

    public static boolean isTreeSame(TNode T1, TNode T2) {
        if (T1 == null && T2 == null) {
            return true;
        }
        if (T1 == null || T2 == null) {
            return false;
        }
        if (T1.data != T2.data) {

            return false;
        }

        return isTreeSame(T1.left, T2.left)
                && isTreeSame(T1.right, T2.right);
    }


}
