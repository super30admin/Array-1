// Time Complexity : O(mn)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None but coming up with this kind of logic takes time.


// Your code here along with comments explaining your approach
you start from the index (0,0) and we consider the direction moving upward as 1 and the direction moving downwards is -1.From each direction we consider the edge cases as in for the direction 1 if the value is in first row then we change the direction to -1 and increase column index .If it is at last column then we reverse the direction to -1 and increment it row wise else we decrement row wise and increment column wise.when we conisder the mirror reversal of the above logic we get the edge cases for the direction -1. 





class Solution(object):
    def findDiagonalOrder(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: List[int]
        """
        if len(matrix)==0 or matrix==None:
            return []
        r=0
        c=0
        out=[]
        
        m=len(matrix)
        n=len(matrix[0])
        dir=1
        while r<=m-1 and c<=n-1:
            out.append(matrix[r][c])
            if dir==1:
                if c==n-1:
                    dir=-1
                    r=r+1
                elif r==0:
                    dir=-1
                    c=c+1
                else:
                    r=r-1
                    c=c+1
            else:
                if r==m-1:
                    dir=1
                    c=c+1
                elif c==0:
                    dir=1
                    r=r+1
                else:
                    r=r+1
                    c=c-1
            
        return out
        