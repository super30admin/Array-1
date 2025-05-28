# Problem #30 Spiral Matrix
#LeetCode 54 https://leetcode.com/problems/spiral-matrix/description/

# Author : Akaash Trivedi
# Time Complexity : O(m*n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode :  Yes #54
# Any problem you faced while coding this : No

class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        m = len(matrix)
        n = len(matrix[0])
        top = left =0
        right = n-1
        bottom = m-1
        res = []
        while left <= right and top <= bottom:
            # top
            for j in range(left,right+1,+1):
                res.append(matrix[top][j])
                #print(matrix[top][j])
            top +=1
            # right
            for i in range(top, bottom+1, +1):
                res.append(matrix[i][right])
                #print(matrix[i][right])
            right -=1
            # bottom row
            if top <= bottom:
                for j in range(right,left-1,-1):
                    res.append(matrix[bottom][j])
                    #print(matrix[bottom][j])
                bottom -=1
            # left
            if left <= right:
                for i in range(bottom,top-1,-1):
                    res.append(matrix[i][left])
                    #print(matrix[i][left])
                left +=1
        return res
