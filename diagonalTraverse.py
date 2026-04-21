# // Time Complexity : O(m*n)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : Yes

class Solution(object):
    def findDiagonalOrder(self, mat):
        """
        :type mat: List[List[int]]
        :rtype: List[int]
        """
        m=len(mat)
        n=len(mat[0])
        reslen=m*n
        res=[]
        dir=1
        r,c=0,0
        for i in range(reslen):
            res.append(mat[r][c])
            if (dir):
                if (c==n-1):
                    r+=1
                    dir=0
                elif (r==0):
                    c+=1
                    dir=0
                else:
                    r-=1
                    c+=1
            else:
                if (r==m-1):
                    c+=1
                    dir=1
                elif (c==0):
                    r+=1
                    dir=1
                else:
                    r+=1
                    c-=1
        
        return res
