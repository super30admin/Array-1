"""
Time Complexity : O(m*n)
Space Complexity : O(1)
Did this code successfully run on Leetcode : yes 
Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
"""


class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        r = len(mat)
        c = len(mat[0])
        dir = True  # direction for upward or downward traversal
        result = [None] * r * c
        # two pointers to track row and col index when retriving elemtns into the result List
        i = 0
        j = 0
        for idx in range(r * c):
            result[idx] = mat[i][j]
            if dir:
                if j == c - 1:
                    i += 1
                    dir = False
                elif i == 0:
                    j += 1
                    dir = False
                else:
                    i -= 1
                    j += 1
            else:
                if i == r - 1:
                    j = j + 1
                    dir = True
                elif j == 0:
                    i += 1
                    dir = True
                else:
                    i += 1
                    j -= 1

        return result
