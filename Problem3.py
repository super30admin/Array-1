"""
// Time Complexity : o(m*n)
// Space Complexity : o(1)
// Did this code successfully run on Leetcode : Yes

// Three line explanation of solution in plain english

Keeping track of the edge indices, we iterate over the enitre matrix and print it diagonally

// Your code here along with comments explaining your approach

"""

class Solution(object):
    def spiralOrder(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: List[int]
        """
        if len(matrix)!=0:
            #using 4 pointers  to keep track of end points at each time
            row_start=0 
            row_end=len(matrix)
            col_start=0
            col_end=len(matrix[0])
            res=[]
            while row_start<row_end and col_start<col_end:
                for i in range(col_start,col_end): #going left to right
                    res.append(matrix[row_start][i])
                row_start=row_start+1 #updating row_start pointer to point to the next row

                for i in range(row_start,row_end): #going top to bottom
                    res.append(matrix[i][col_end-1])
                col_end=col_end-1
               
                if(row_start<row_end): #right to left
                    for i in range(col_end-1,col_start-1,-1):
                        res.append(matrix[row_end-1][i])
                    row_end=row_end-1
               
                if(col_start<col_end): #bottom to top
                    for i in range(row_end-1,row_start-1,-1):
                        res.append(matrix[i][col_start])
                    col_start=col_start+1
            return(res)