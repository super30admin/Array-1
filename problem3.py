# // Time Complexity : O(m*n)
# // Space Complexity : o(1)
# // Did this code successfully run on Leetcode : Yes

class Solution(object):
    def spiralOrder(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: List[int]
        """

        if matrix is None or len(matrix) == 0:
            return []

        low = 0
        high = len(matrix) - 1
        left = 0
        right = len(matrix[0]) - 1

        retArr = []

        while low <= high and left <= right:
            for j in range(left, right + 1):
                retArr.append(matrix[low][j])
            low += 1

            for i in range(low, high + 1):
                retArr.append(matrix[i][right])
            right -= 1

            if low <= high:
                for j in range(right, left - 1, -1):
                    retArr.append(matrix[high][j])
                high -= 1

            if left <= right:
                for i in range(high, low - 1, -1):
                    retArr.append(matrix[i][left])
                left += 1

        return retArr





