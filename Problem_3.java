/*
Time Complexity :O(mn)
Space Complexity : O(n)
Did this code successfully run on Leetcode : not tried on Leetcode. It ran on my IDE with correct console output.
Any problem you faced while coding this : Referred from geeksforgeeks
*/

import java.io.*;

class spiralMatrix {

    static void spiralPrint(int m, int n, int a[][])
    {
        int i, k = 0, l = 0;

        while (k < m && l < n) {
            for (i = l; i < n; ++i) {
                System.out.print(a[k][i] + " ");
            }
            k++;

            for (i = k; i < m; ++i) {
                System.out.print(a[i][n - 1] + " ");
            }
            n--;

            if (k < m) {
                for (i = n - 1; i >= l; --i) {
                    System.out.print(a[m - 1][i] + " ");
                }
                m--;
            }
            if (l < n) {
                for (i = m - 1; i >= k; --i) {
                    System.out.print(a[i][l] + " ");
                }
                l++;
            }
        }
    }
    public static void main(String[] args)
    {
        int R = 3;
        int C = 3;
        int a[][] = { { 1, 2, 3 },{ 4, 5, 6 }, { 7, 8, 9 } };
        spiralPrint(R, C, a);
    }
}