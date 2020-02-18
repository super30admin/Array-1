# Time Complexity : O(M*N)
# Space Complexity : O(M*N)
# Did this code successfully run on Leetcode : Yes
# Three line explanation of solution in plain english
#I keep track of the traversal direction using a flag up, setting it to True and False accordingly.
#Keep a track of boundaries and update the output array accordingly
# Your code here along with comments explaining your approach


class Solution(object):
    def findDiagonalOrder(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: List[int]
        
        """
        # Edge case of empty matrix or Null matrix is handled here
        if matrix == None or len(matrix) == 0:
            return []
        m = len(matrix)
       
        
        n = len(matrix[0])
        
        up = True
        row = 0
        col = 0
        
        output = [0 for i in range(m*n)]
        
        #Loop through all the elements in the given matrix
        for i in range(m*n):
            
            output[i] = matrix[row][col]
            
            #If the traversal is going in up direction 
            if up:
                
                #Check if last column has been reached
                if col == n-1:
                    row = row+1
                    up = not up
                #Check if in first row 
                elif row == 0:
                    col = col+1
                    up = not up
                #Traverse normally
                else:
                    row = row-1
                    col = col+1
                    
            else:
                #Check if last row has been reached
                if row == m-1:
                    col = col+1
                    up = not up
                
                #Check if in first column
                elif col == 0:
                    row = row+1
                    up = not up
                
                #Traverse normally
                else:
                    row = row+1
                    col = col-1
                    
        return output
        

                    