// Time Complexity : O(n*m)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

class Solution:
    def findDiagonalOrder(self, matrix: List[List[int]]) -> List[int]:
        if matrix==None or len(matrix)==0 or len(matrix[0])==0:
            return []
        n=len(matrix)
        m=len(matrix[0])
        
        lst=[0]*(n*m)
        index=0
        i=0
        j=0
        d=1
        while index < n*m:
            lst[index]=matrix[i][j]
            index+=1
            
            if d==1:              //moving upward direction
                if j == m-1:
                    d= -1
                    i+= 1
                elif i==0:
                    j +=1
                    d =-1
                else:
                    i -=1
                    j +=1
                    
            else:                 //moving downward direction
                if i==n-1:
                    d=1
                    j+=1
                elif j==0:
                    i+=1
                    d=1
                else:
                    i+=1
                    j-=1
        return lst
