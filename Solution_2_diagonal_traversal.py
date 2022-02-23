// Time Complexity : O(m*n) 
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution:
    def findDiagonalOrder(self, matrix: List[List[int]]) -> List[int]:
        
        m= len(matrix)    #number of rows
        
        if m==0: return []
        
        n=  len(matrix[0]) #number of columns
    
        index=0
        i=0
        j=0
        dir=1
        result=[0 for i in range(m*n)]
        
        while index<m*n:
            result[index]=matrix[i][j]
            
            if dir==1:
                if j==n-1:
                    i=i+1
                    dir=-1
                elif i==0:
                    j=j+1
                    dir=-1
                else:
                    j=j+1
                    i=i-1
            else:
                if i==m-1:
                    j=j+1
                    dir=1
                elif j==0:
                    i=i+1
                    dir=1
                else:
                    j=j-1
                    i=i+1
            index=index+1
        return result
            
        
		
		