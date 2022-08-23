#Executed on leetcode
#time complexity - O(n)
#Space complexity - O(1)
class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        max_rows, max_cols = len(matrix), len(matrix[0])
        min_rows = min_cols = 0

        res = []
        cur_rows = cur_cols = 0
		
        while len(res) != len(matrix) * len(matrix[0]):
            while cur_cols < max_cols:                                        #go forward
                res.append(matrix[cur_rows][cur_cols])
                cur_cols += 1
            if cur_cols == max_cols:
                cur_cols -= 1
            min_rows += 1  #new minimal row to which you can go up to
            cur_rows += 1
            
            while cur_rows < max_rows and len(res) != len(matrix) * len(matrix[0]): #go down
                res.append(matrix[cur_rows][cur_cols])
                cur_rows += 1
            if cur_rows == max_rows:
                cur_rows -= 1
            max_cols -= 1 #new max column to which you can go up to
            cur_cols -= 1
            
            while cur_cols >= min_cols and len(res) != len(matrix) * len(matrix[0]): #go backward
                res.append(matrix[cur_rows][cur_cols])
                cur_cols -= 1
            if cur_cols == min_cols - 1:
                cur_cols += 1  
            max_rows -= 1 #new max row to which you can go up to
            cur_rows -= 1
            
            while cur_rows >= min_rows and len(res) != len(matrix) * len(matrix[0]): #go up
                res.append(matrix[cur_rows][cur_cols])
                cur_rows -= 1
            if cur_rows == min_rows - 1:
                cur_rows += 1
            min_cols += 1 #new minimal column to which you can go up to
            cur_cols += 1

        return res