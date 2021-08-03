#spiral matrix
#solution accepted
#time complexity:O(n*m)where n and m are size of matrix rows and columns
#space complexity:O(n) since we are creating an new array and then adding reuslt to that
class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        res = []#crerating an empty array to add the final result to
        if len(matrix) == 0:
            return res
        row_begin = 0 #creating 4 pointer one at start and and end of row,cols 
        col_begin = 0
        row_end = len(matrix)-1 
        col_end = len(matrix[0])-1
        while (row_begin <= row_end and col_begin <= col_end):#conditons for while loop to start
            for i in range(col_begin,col_end+1): 
                res.append(matrix[row_begin][i])
            row_begin += 1
            for i in range(row_begin,row_end+1):
                res.append(matrix[i][col_end])
            col_end -= 1
            if (row_begin <= row_end):
                for i in range(col_end,col_begin-1,-1):
                    res.append(matrix[row_end][i])
                row_end -= 1
            if (col_begin <= col_end):
                for i in range(row_end,row_begin-1,-1):
                    res.append(matrix[i][col_begin])
                col_begin += 1
        return res