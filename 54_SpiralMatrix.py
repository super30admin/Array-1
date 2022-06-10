"""
Update - Try it with recursion
Leetcode - https://leetcode.com/problems/spiral-matrix/ (submitted)
TC- O(M+N), SC- O(1)
Lecture- https://youtu.be/o_U50Uzz9Ek
FAQ-
Why duplicate check inside your while loop? Because we are changing the variables in our condition check inside the loop
Other techniques? With recursion because it's a repeated subproblem

Given an m x n matrix, return all elements of the matrix in spiral order.

Example 1:
Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [1,2,3,6,9,8,7,4,5]

Example 2:
Input: matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
Output: [1,2,3,4,8,12,11,10,9,5,6,7]

Constraints:
m == matrix.length
n == matrix[i].length
1 <= m, n <= 10
-100 <= matrix[i][j] <= 100
"""

'''
Ideation- Two pointer approach
The idea is to decrease the availability of the matrix such that already visited nodes are taken out from it.
So if you go right, the whole row is visited at the end of iteration and we can reduces our top row by 1.
Similarly, if we finish going down, the right column pointer will be reduced by one.
Similarly, if we go left, the bottom row pointer should be decreased.
Similarly, if we go left, the left column pointer should be decreased.
When, top row and bottom row pointer cross or left column and right column pointer cross, our algorithm will be finished

NOTE: check for valid pointers after each direction iteration since we are manipulating the pointers after each 
iteration.
'''


class Solution:
    def spiralOrder(self, matrix):
        result = []
        m, n = len(matrix), len(matrix[0])
        tr, br = 0, m - 1
        lc, rc = 0, n - 1
        while tr < m and br >= 0 and lc < n and rc >= 0 and tr <= br and lc <= rc:
            # go right
            for i in range(lc, rc + 1):
                result.append(matrix[tr][i])
            tr += 1
            # go down - check for valid pointers and pointers haven't crossed.
            if tr < m and br >= 0 and lc < n and rc >= 0 and tr <= br and lc <= rc:
                for i in range(tr, br + 1):
                    result.append(matrix[i][rc])
                rc -= 1
            # go left - check for valid pointers and pointers haven't crossed.
            if tr < m and br >= 0 and lc < n and rc >= 0 and tr <= br and lc <= rc:
                for i in range(rc, lc - 1, -1):
                    result.append(matrix[br][i])
                br -= 1
            # go up - check for valid pointers and pointers haven't crossed.
            if tr < m and br >= 0 and lc < n and rc >= 0 and tr <= br and lc <= rc:
                for i in range(br, tr - 1, -1):
                    result.append(matrix[i][lc])
                lc += 1

        return result


arr = [[1, 2, 3, 4], [5, 6, 7, 8], [9, 10, 11, 12]]
spiralOutput = Solution().spiralOrder(arr)
print(spiralOutput)
