#Time Complexity : O(m*n)
#Space Complexity : O(1)
#Any problem you faced while coding this : none

#Your code here along with comments explaining your approach
class Solution(object):
    def findDiagonalOrder(self, mat):
        """
        :type mat: List[List[int]]
        :rtype: List[int]
        """
        dir=True  #flag to store the direction of traversal
        ret_val=[]
        row=0
        col=0
        m=len(mat)
        n=len(mat[0])
        for i in range(m*n): # cover all the elements in the matrix
            ret_val.append(mat[row][col])
            if dir:          # if in the upward direction
                if row==0 and col!=n-1: # of first row and there are still columns
                    col=col+1
                    dir=False
                elif col==n-1:          # if reached the last column
                    row=row+1
                    dir=False
                else:                   # if no boundary condition
                    row-=1
                    col+=1
            else:                      # if in downward direction
                if col==0 and row!=m-1: # if the first col but there are still rows
                    row=row+1
                    dir=True
                elif row==m-1:          # if covered all the rows 
                    col=col+1
                    dir=True
                else:                   # if no boundary condition
                    row+=1
                    col-=1
        return ret_val 