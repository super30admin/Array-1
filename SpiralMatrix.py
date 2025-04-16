# Time Complexity : O(m*n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


from typing import List


class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        left, right = 0, len(matrix[0])-1
        top, bottom = 0, len(matrix)-1
        result = []
        while(left <= right and top <= bottom):
            for i in range(left, right+1):
                result.append(matrix[top][i])
            top += 1
            for i in range(top,bottom+1):
                result.append(matrix[i][right])
            right -= 1
            if top <= bottom:
               for i in range(right, left-1 , -1):
                   result.append(matrix[bottom][i])
               bottom -= 1
            if left <= right:
                for i in range(bottom, top-1, -1):
                    result.append(matrix[i][left])
                left += 1

        return result
