# Time Complexity : Brute Force: O(m*n)
# Space Complexity : Brute Force: O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : -

class Solution(object):
    def spiralOrder(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: List[int]
        """
        if matrix == [] or len(matrix) == 0:
            return []

        # Create 4 pointers and move the pointer according to conditions.
        left, right, top, bottom = 0, len(matrix[0]), 0, len(matrix)
        retList = []
        while left < right and top < bottom:
            for i in range(left, right):
                retList.append(matrix[top][i])
            top += 1
            for i in range(top, bottom):
                retList.append(matrix[i][right-1])
            right -= 1 
            if top < bottom:
                for i in range(right - 1, left - 1, -1):
                    retList.append(matrix[bottom-1][i])
                bottom -= 1
            if left < right:
                for i in range(bottom-1, top-1, -1):
                    retList.append(matrix[i][left])
                left += 1
        return retList