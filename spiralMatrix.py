"""
Approach: 
Use 4 pointers, top, left, right, bottom. Initialize them properly and then while top <=bottom and left<=right
In total we are iterating over top row, then right column and then bottom row and left column
every time we are done with a row or column, reduce or increase counters accordingly
As we only go over matrix once overall TC should be O(m*n)
TC O(m*n)
SC O(1) as no extra space used
"""
class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        top, left, right, bottom = 0, 0, len(matrix[0])-1, len(matrix)-1
        r = []
        while top <= bottom and left <= right:
            # top row
            for i in range(left,right+1):
                r.append(matrix[top][i])
            top += 1
            # right column
            
            for i in range(top,bottom+1):
                r.append(matrix[i][right])
            right -= 1
            # bottom row
            if top <= bottom:
                for i in range(right, left-1, -1):
                    r.append(matrix[bottom][i])
            bottom -=1
            # left column
            if left <= right:
                for i in range(bottom, top-1, -1):
                    r.append(matrix[i][left])
            left += 1
                
        return r