# S30 Big N Problem #26 {Medium}
# Leetcode #498

# An input array of size MXN where M is number of rows and N is number of columns, you need to return all lements of this matrix in diagonal order as shown in the below image. 

# Time Complexity : O(n*m) n= no. of columns, m= no. of rows
# Space Complexity : O(1) 
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No 

# Approach:
# Maintain a flag to determine whether we have to move upward or downward. 
# Based on the direction, increment/decrement the row and column pointers. 
# Consider the case of when you reach the start/end of row/column to change the direction. 

class Solution:
    def findDiagonalOrder(self, matrix: List[List[int]]) -> List[int]:
        
        res=[]
        
        m=len(matrix)
        
        if m==0:
            return []
        n=len(matrix[0])
        
        
        i=0
        j=0
        
        isUp=True
        
        count=0
        
        
        while count<m*n:
            print(i,j,count)
            res.append(matrix[i][j])
            count+=1
            
            if isUp:
            
                if j==n-1 :
                    isUp=False
                    i+=1

                elif i==0:
                    isUp=False
                    j+=1
                else:
                    j+=1
                    i-=1
            
            else:
                
                if i==m-1:
                    isUp=True
                    j+=1
                    
                elif j==0:
                    isUp=True
                    i+=1
                else:
                    i+=1
                    j-=1
                    
                    
        return res
                    
                
                
                
            
            
            
                
                    
                
                
            
            
        
