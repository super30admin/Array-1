# Time Complexity : O(MxN), traversisng elements in array, hashmap search is constant time
# Space Complexity : O(1),
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : no

class Solution(object):
    def spiralOrder(self, matrix):
        m = len(matrix)
        n = len(matrix[0])
        top, bottom = 0, m - 1
        left, right = 0, n - 1
        res = []

        while (top <= bottom and left <= right):

            # top row
            if (top <= bottom):
                for j in range(left, right+1, 1):
                    res.append(matrix[top][j])
                top += 1

            # right most column
            if (left <= right):
                for i in range(top, bottom+1, 1):
                    res.append(matrix[i][right])
                right -= 1

            # bottom row
            if (top <= bottom):
                for j in range(right, left - 1, -1):
                    res.append(matrix[bottom][j])
                bottom -= 1

            # left most column
            if (left <= right):
                for i in range(bottom, top - 1, -1):
                    res.append(matrix[i][left])
                left += 1 
        return res 
            
        