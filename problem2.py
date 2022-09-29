 #Time Complexity :O(n)
 #Space Complexity :O(1)
 #Did this code successfully run on Leetcode :Yes
 #Any problem you faced while coding this :No

class Solution(object):
    def findDiagonalOrder(self, mat):
        """
        :type mat: List[List[int]]
        :rtype: List[int]
        """
        row=len(mat)
        col=len(mat[0])
        arr=[0]*(row*col)
        r,c=0,0
        di=1
        idx=0
        while idx <(row*col):
            arr[idx]=mat[r][c]
            idx+=1
            if di==1:
                if(c==col-1):
                    di=-1
                    r+=1
                elif (r==0):
                    di=-1
                    c+=1
                else:
                    r-=1
                    c+=1
            else:
                if (r==row-1):
                    di=1
                    c+=1
                elif (c==0):
                    di=1
                    r+=1
                else:
                    r+=1
                    c-=1
        return arr