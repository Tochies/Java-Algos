/*
 * Copyright (c) 2021.
 *
 * @author Tochie
 *
 * Date 9/9/21, 10:59 PM
 */

package com.generic;

public class TNode {

    public int data;
    public TNode left, right;

    TNode(int data) {
        this.data = data;
    }

    public static void preOrder(TNode root) {
        if (root == null) { return; };
        System.out.println(root.data);
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void inOrder(TNode root) {
        if (root == null) { return; };inOrder(root.left);
        System.out.println(root.data);
        inOrder(root.right);
    }

    public static void postOrder(TNode root) {
        if (root == null) { return; };
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.data);
    }
}
