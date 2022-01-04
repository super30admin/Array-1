# Time Complexity : O(n*m) where n and m are the size of the matrix.
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        top = 0
        bottom = len(matrix)-1
        left = 0
        right = len(matrix[0]) - 1
        res = []
        while(left<=right and top <= bottom):
            # left to right
            for i in range(left,right+1):
                res.append(matrix[top][i])
            top += 1
            
            if left<=right and top <= bottom:
                for i in range(top,bottom +1):
                    res.append(matrix[i][right])
            right -= 1
            
            if left<=right and top <= bottom:
                for i in range(right,left-1,-1):
                    res.append(matrix[bottom][i])
            bottom -= 1
            
            if left<=right and top <= bottom:
                for i in range(bottom,top-1,-1):
                    res.append(matrix[i][left])
            left += 1
        return res
