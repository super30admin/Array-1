'''
-- Passed test cases on LeetCode
'''

class Solution:
    #O(m * n) -- Time Complexity where m is number of rows and n is number of columns; O(1) -- Space Complexity
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        if matrix is None or len(matrix)== 0:
            return []
        row_len = len(matrix)
        col_len = len(matrix[0])
        res = [0 for i in range(row_len * col_len)]
        
        cnt = 0
        top = 0
        bottom = row_len -1
        right = col_len -1
        left = 0
        
        while(top <= bottom and left <=right):
            for col in range(left, right +1):
                res[cnt] = matrix[top][col]
                cnt += 1
            top += 1
            
            for row in range(top, bottom +1):
                res[cnt] = matrix[row][right]
                cnt += 1
            right -=1
            
            if(top <= bottom):
                for col in range(right, left-1, -1):
                    res[cnt] = matrix[bottom][col]
                    cnt += 1
                bottom -= 1
            
            if (left <= right):
                for row in range(bottom, top-1, -1):
                    res[cnt] = matrix[row][left]
                    cnt +=1
                left += 1
                
        return res
            
                
                
            
                
        
