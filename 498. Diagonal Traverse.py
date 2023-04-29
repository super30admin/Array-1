#Time Complexity:O(n*m)
#Space Complexity:O(1)
class Solution(object):
    def findDiagonalOrder(self, mat):
        """
        :type mat: List[List[int]]
        :rtype: List[int]
        """
        row=0
        col=0
        result=[]
        m=len(mat)
        n=len(mat[0])
        dire=1
        for i in range(n*m):
            result.append(mat[row][col])
            if dire==1:
                if col==n-1:
                    dire=-1
                    row=row+1
                elif row==0:
                    col=col+1
                    dire=-1
                else:
                    row=row-1
                    col=col+1
            else:
                if row==m-1:
                    dire=1
                    col=col+1
                elif col==0:
                    row=row+1
                    dire=1
                else:
                    row=row+1
                    col=col-1
        return result