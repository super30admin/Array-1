# Time Complexity : O(m*n) where m is number of rows of matrix and n is no of columns, we are traversing through both
#Space Complexity : O(1)   - we didn't use any extra space, and we don't count the output array as extra space
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No




#basically we are gong direction wise and appending the values to the resultant array, for instance, if we are starting with the first element and we are moving in the top direction , 
# next we have to turn the direction and go down, where row index decrease and column index increase, directions will be changed only when the extremes are breached(top most elements or down most elements), 
# we can do that by maintaining and changing a flag and by doing in both instances, the resultant array will finally have values in the order we need


class Solution:
    def findDiagonalOrder(self, mat):
        
  
        
        result = [1]*(len(mat)*len(mat[0]))  
        m = len(mat)  #row size
        n = len(mat[0]) #column size
        r,c = 0,0 #row index & col index
        idx = 0  #current index of resultant elements in resultant array
        dire = 1  #direction is initially set to 1 (upward)
         
        
        while idx < len(result): 
            
            result[idx] = mat[r][c] 
            
            idx+=1  
            
            #if it's in the upward direction, check whether the column value is in the extreme,if it is, then increase the row and change the direction or just increase the column. 
            # if both are not in extreme, then simply decrease the row and increase the column
            
            if (dire == 1):  
                
                if (c == n-1): 
                    
                    r+=1 
                    dire = -1 
                    
                elif r == 0: 
                    
                    c+=1 
                    dire = -1 
                    
                else: 
                    
                    r-=1 
                    c+=1
             
           #if it's in the downward direction, check whether the row value is in the extreme,if it is, then increase the column and change the direction or just increase the row.
           # if both are not in extreme, then simply increase the row and decrease the column
        
            else: 
                
                if (r == m-1): 
                    
                    c+=1
                    dire = 1 
                    
                elif c == 0: 
                    
                    r+=1 
                    dire = 1 
                    
                else: 
                    
                    c-=1 
                    r+=1  
                    
        return result
                    
                
        