"""
//Time Complexity : O(m*n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :YES
// Any problem you faced while coding this : NO
"""

class Solution(object):
    def findDiagonalOrder(self, mat):
        """
        :type mat: List[List[int]]
        :rtype: List[int]
        """
        if len(mat)==0:
            return []
        m = len(mat)       #rows
        n = len(mat[0])    #colums
        result = [0]*m*n
        i,r,c,di= 0,0,0,1
        while(i<m*n):
            result[i]=mat[r][c]
            if(di == 1):
                if(c==n-1):
                    di = -1
                    r+=1
                elif(r==0):
                    di = -1
                    c+=1
                
                else:
                    r-=1
                    c+=1   
            else:
                if(r==m-1):
                    di = 1
                    c+=1
                elif(c == 0):
                    di = 1
                    r+=1
                else:
                    r+=1
                    c-=1   
            i+=1
        return result