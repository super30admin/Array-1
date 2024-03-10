
"""
498. Diagonal Traverse
Medium
"""
from leetcode_runner import LeetCode, TestCase, Args
from typing import *

PROBLEM = """
Given an m x n matrix mat, return an array of all the elements of the array in a diagonal order.
 
Example 1:


Input: mat = [[1,2,3],[4,5,6],[7,8,9]]
Output: [1,2,4,7,5,3,6,8,9]

Example 2:

Input: mat = [[1,2],[3,4]]
Output: [1,2,3,4]

 
Constraints:

m == mat.length
n == mat[i].length
1 <= m, n <= 104
1 <= m * n <= 104
-105 <= mat[i][j] <= 105


"""

class Solution:
    """
    Accepted
    Time Complexity :  O(n)
    Space Complexity : O(1)
    Did this code successfully run on Leetcode : Yes
    Runtime 99%
    Memory  35%
    
    Explanation:
    THe intuition is to move diagonally and change direction when you hit the border.
    TO move diagnolly, we need to move up and right or down and left. Lets call it Up or Down. The dir boolen will help us keep track of the direction.
    Rule 1: We will start with Up. When we hit the top border, we need to shift right. When we hit the right border, we need to shift down.
    Rule 2: We will start with Down. When we hit the bottom border, we need to shift right. When we hit the left border, we need to shift down.
    NOTE: There is an edge case where we hit the top right corner. In this case, we need to shift down. 
            Similarly, there is an edge case where we hit the bottom left corner. In this case, we need to shift right.
    SOL -> To avoid this edge case, we should check for the right/left border first and then top/bottom border.
    Do it until we have traversed all the elements.
    
    """
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        i,j  = 0, 0
        res = []
        dir = True
        m = len(mat)
        n = len(mat[0])
        size = m * n
        for _ in range(size): # O(n)
            res.append(mat[i][j])
            if dir is True: # while going up
                if j == n-1: # right border || shift down and change direction to down
                    i += 1
                    dir = False
                elif i == 0 : # top border || shift right and change direction to down
                    j += 1
                    dir = False
                else: # otherwise, continue going upwards
                    i -= 1
                    j += 1
            else: # while going down
                if i == m-1: # bottom border || shift right and change direction to up
                    j += 1
                    dir = True
                elif j == 0 : # left border || shift down and change direction to up
                    i += 1
                    dir = True
                else: # otherwise, continue going downwards
                    j -= 1
                    i += 1
        return res

LeetCode(PROBLEM, Solution).check()
