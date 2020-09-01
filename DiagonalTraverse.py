// Time Complexity : O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// // Any problem you faced while coding this : No

// Your code here along with comments explaining your approach

class Solution:
    def findDiagonalOrder(self, matrix: List[List[int]]) -> List[int]:
        if matrix is None or len(matrix)==0 or len(matrix[0])==0:
            return []
        m=len(matrix)
        n=len(matrix[0])
        index=0
        dirs=1 # dirs variable to know the direction of the traversal.
        i=0
        j=0
        res=[0]*(m*n) #index for result with size of original matrix.
        while index < m*n:
            res[index]=matrix[i][j] # start from the first element, and update every other change
            index+=1
            if dirs == 1: # if movement is upwards
                if j==n-1: # if index is in the last element of the row, go to next row
                    dirs=-1
                    i+=1
                elif i==0: # if element reaches the first row, go to next column
                    dirs=-1
                    j+=1   
                else: # else traverse diagonally
                    i-=1
                    j+=1
            else:          # if movement is downwards
                if i==m-1: # if index is in the last element of the column, go to next column
                    dirs=1
                    j+=1
                elif j==0: # if element reaches the first column, go to next row
                    dirs=1
                    i+=1                   
                else: # else traverse diagonally
                    i+=1
                    j-=1
        return res
                