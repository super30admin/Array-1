#https://leetcode.com/problems/diagonal-traverse/submissions/
#time-o(m*n)
#space-o(1)
class Solution(object):
    def findDiagonalOrder(self, mat):
        """
        :type mat: List[List[int]]
        :rtype: List[int]
        """
        if not mat:
            return [0]
        n=len(mat)
        m=len(mat[0])
        res=[]
        #res[0]=mat[0][0]
        dir1=1
        print(res)
        i=0
        row=0
        col=0
        while i<m*n:
            res.append(mat[row][col])
            if dir1==1:
                if col==m-1:
                    dir1=-1
                    row+=1
                elif row==0:
                    dir1=-1
                    col+=1
                else:
                    row-=1
                    col+=1
                
            else:
                if row==n-1:
                    dir1=1
                    col+=1
                elif col==0:
                    dir1=1
                    row+=1
                else:
                    col-=1
                    row+=1
            #res[i]=mat[row][col]
            i+=1
        return res