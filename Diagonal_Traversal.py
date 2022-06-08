'''
-- Passed test cases on LeetCode
'''
class Solution:
    #O(m * n) -- Time Compexity where m= number of rows n = number of columns; O(1) -- Space Complexity
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        if mat is None or len(mat) == 0:
            return []
        
        row_len = len(mat)
        col_len = len(mat[0])
        res = [0 for i in range(row_len * col_len)]
        
        direction = 1
        row = 0
        col = 0
        cnt = 0
        
        while (cnt <= (row_len * col_len) -1):
            res[cnt] = mat[row][col]
            
            if direction == 1:
                if (col == col_len -1):
                    row +=1
                    direction = 0
                elif (row == 0):
                    col +=1
                    direction = 0
                else:
                    row -=1
                    col +=1
            else:
                if (row == row_len -1):
                    col+=1
                    direction = 1
                elif (col ==0):
                    row +=1
                    direction = 1
                else:
                    row +=1
                    col -=1
                    
            cnt+=1
            
        return res
            
            
        
