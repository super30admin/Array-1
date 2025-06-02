"""
Time Complexity : O(n)
Space Complexity : O(1)
Did this code successfully run on Leetcode : YES
"""
class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        m = len(mat)
        n = len(mat[0])
        arr = []
        idx = 0
        i = 0
        j = 0
        flag = True  # True means going up-right

        while idx < m * n:
            arr.append(mat[i][j])
            idx += 1

            if flag:  # moving up
                if j == n - 1:
                    i += 1
                    flag = False
                elif i == 0:
                    j += 1
                    flag = False
                else:
                    i -= 1
                    j += 1
            else:  # moving down
                if i == m - 1:
                    j += 1
                    flag = True
                elif j == 0:
                    i += 1
                    flag = True
                else:
                    i += 1
                    j -= 1

        return arr
