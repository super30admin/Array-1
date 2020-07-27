# ## Problem 2

# Given a matrix of M x N elements (M rows, N columns), return all elements of the matrix in diagonal order as shown in the below image.

#Time Complexity : O(n*m)
# Space Complexity : O(1) 
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Approach: traverse the array diagonally using the up and down direction logic

class Solution:
    def findDiagonalOrder(self, matrix: List[List[int]]) -> List[int]:
        if matrix is None or len(matrix)==0:
            return []
        m=len(matrix)
        n=len(matrix[0])
        result=[None]*(m*n)
        row=0
        col=0
        
        #up direction
        direction=1
        
        i=0
        
        # from start until the length of the array
        while(i<(m*n)):
            result[i]=matrix[row][col]
            # up direction
            if direction==1:
                if col==n-1:
                    row+=1
                    # since the column is end of matrix is reached we need to traverse down
                    direction=-1
                elif row==0:
                    col+=1
                    # since the row is start of matrix, reached, we need to traverse down 
                    direction=-1
                else:
                    # moving diagonal up (row is reduced and column is increased when we move up)
                    row-=1
                    col+=1
            #low direction
            else:
                if row==m-1:
                    col+=1
                    # since the column is end of matrix is reached we need to traverse down
                    direction=1
                elif col==0:
                    row+=1
                    # since the row is start of matrix, reached, we need to traverse down 
                    direction=1
                else:
                    # moving diagonal down (row is increased and column is decreased when we move dowm)
                    row+=1
                    col-=1
            i+=1
        return result
                    
                
            
        
        
            
        
        
        