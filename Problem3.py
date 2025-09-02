"""
TC: O(N*M) {we iterate for every element of the matrix only once}
SC: O(1) {we dont use any extra space during our algorithm for compute}

Approach:

We first set up boundary conditions such as row/col==0 and row/col == N-1/M-1. We know that at every border condition we need to
change our direction in a clockwise manner. For example, once we are done with left-right traversal, we traverse top-bottom and so on.

We take 4 pointers left, right, top, bottom that are updated after their iteration so as to keep the traversal follow a spiral pattern
converging inwards. We store the element in the resultant array and finally return it.


The problem ran successfully on Leetcode.
"""

from typing import List

class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        n,m = len(matrix), len(matrix[0])
        top, left = 0, 0
        right, bottom = m-1, n-1
        res = []

        while left <= right and top <= bottom:

            #top row
            for j in range(left, right+1):
                res.append(matrix[top][j])
            top += 1
            
            if not top <= bottom:
                break

            #right col
            for i in range(top, bottom+1):
                res.append(matrix[i][right])
            right -= 1

            if not (left <= right):
                break

            #bottom row
            for j in range(right, left-1, -1):
                res.append(matrix[bottom][j])
            bottom -= 1

            if not (top <= bottom):
                break

            #left col
            for i in range(bottom, top-1, -1):
                res.append(matrix[i][left])
            left += 1

        return res