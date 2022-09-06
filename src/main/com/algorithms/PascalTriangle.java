//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.algorithms;

public class PascalTriangle {
  public PascalTriangle() {
  }

  public static void main(String[] args) {
    triangle();
  }

  private static void triangle() {
    int n = 4;
    int[][] triangle = new int[n][];

    int r;
    int c;
    for(r = 0; r < n; ++r) {
      triangle[r] = new int[r + 1];
      triangle[r][0] = 1;
      triangle[r][r] = 1;

      for(c = 1; c < r; ++c) {
        triangle[r][c] = triangle[r - c][c - 1] + triangle[r - 1][c];
      }
    }

    for(r = 0; r < triangle.length; ++r) {
      for(c = 0; c < triangle[r].length; ++c) {
        System.out.printf("%4d", triangle[r][c]);
      }

      System.out.println();
    }

  }
}
