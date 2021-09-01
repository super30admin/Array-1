# // Time Complexity : O(m*n) where m*n: number of elements in the matrix
# // Space Complexity : O(m*n) where m*n: number of elements
# // Did this code successfully run on Leetcode : yes
# // Any problem you faced while coding this : none

# // Your code here along with comments explaining your approach
class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        row_start = 0
        row_end = len(matrix) - 1
        col_start = 0
        col_end = len(matrix[0]) - 1
        res = []
        
        while row_start <= row_end and col_start <= col_end:
            
            # top row
            for c in range(col_start,col_end+1):
                res.append(matrix[row_start][c])
            row_start += 1
            
            if row_start > row_end: break
                
            # last col
            for r in range(row_start,row_end+1):
                res.append(matrix[r][col_end])
            col_end -= 1
            
            if col_end < col_start: break
                
            # last row
            if row_start <= row_end:
                
                for c in range(col_end,col_start-1,-1):
                    res.append(matrix[row_end][c])
                row_end -= 1
            
            # first col
            if col_start <= col_end:
                
                for r in range(row_end,row_start-1,-1):
                    res.append(matrix[r][col_start])
                col_start += 1
            
        return res
        