# S30 Big N Problem #27 {Medium }

# An input matrix of size M*N is given return all elements of the matrix in spiral order. 

# Time Complexity : O(n*m) n= no. of columns m=no. of rows
# Space Complexity : O(1) 
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No 

# Approach 
# Traverse the elements in the matrix in the order top row,
# last column, bottom row, first column. 
# maintain 4 pointers. increment and decrement them once the traversal is completed.


class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        
        k,m=0,len(matrix)-1
        
        if m==0:
            return []
        l,n=0,len(matrix[0])-1
        
        i,j=0,0
        res=[]
        count=0
        
        while count<m*n:
            
            for i in range()
                print(i,j)
                res.append(matrix[i][j])
                count+=1
                j+=1
            
            k+=1
            
            while i<m:
                print(i,j)

                res.append(matrix[i][j])
                count+=1
                i+=1
            
            n-=1
            
         
            while j>l:
                print(i,j)
                res.append(matrix[i][j])
                count+=1
                j-=1
            
            m-=1
            
            
            while i<k:
                print(i,j)
                res.append(matrix[i][j])
                count+=1
                i-=1
            
            l+=1
            
    
        return res
                
            
            
                
                
                
                
            
            
        