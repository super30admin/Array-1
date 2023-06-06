# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : NA

# Approach is to go by direction up or down then increment or decrement the i and j based edge cases or boundaries.

class Solution(object):
    def findDiagonalOrder(self, mat):
        """
        :type mat: List[List[int]]
        :rtype: List[int]
        """
        res=[]
        m=len(mat)
        n=len(mat[0])
        l=m*n
        i=0
        j=0
        dir=1
        k=0
        while(k<l):
            res.append(mat[i][j])
            k+=1
            if(dir):
                if (i==0 and j!=n-1):
                    j+=1
                    dir=0
                elif(j==n-1):
                    i=i+1
                    dir=0
                else:
                    i=i-1
                    j=j+1

            else:
                if (j==0 and i!=m-1):
                    i+=1
                    dir=1
                elif(i==m-1):
                    j=j+1
                    dir=1
                else:
                    j=j-1
                    i=i+1
        return res