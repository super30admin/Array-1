#Problem 498: DIAGONAL TRAVERS
# TIME COMPELXITY: O(M*N) where M denotes the row and N denotes the col 
# SPACE COMPLEXITY: O(1) are we only use variables to track directions and positioning

class Solution(object):
    def findDiagonalOrder(self, mat):
        """
        :type mat: List[List[int]]
        :rtype: List[int]
        """
        m=len(mat)
        n=len(mat[0])
        result=[]
        row=0
        col=0
        up=True

        while len(result)<m*n:
            result.append(mat[row][col])

            if up:
                if col==n-1:
                    row+=1
                    up=False
                elif row==0:
                    col+=1
                    up=False
                else:
                    row-=1
                    col+=1
            else:
                if row==m-1:
                    col+=1
                    up=True
                elif col==0:
                    row+=1
                    up=True
                else:
                    row+=1
                    col-=1
        return result