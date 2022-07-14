# Time Complexity : O(M x N) //As it would run for each row and column of the array
#  Space Complexity : O(1) //As we are using the same array to return the result
#  Did this code successfully run on Leetcode : Yes
#  Any problem you faced while coding this : N/A

#  Your code here along with comments explaining your approach
class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        #Base casae if my matrix is null
        if not mat or not mat[0]:
            return []
        
        #Declare varaible fro row and column length
        m = len(mat)
        n = len(mat[0])
        
        res = []
        r,c = 0,0
        dir =1 #Take this variable to keep track of direction 1=> uppward
        
        #Iterate over the entire matrix
        while r < m and c < n:
            #First value to be stored and the the next value at each iteration
            res.append(mat[r][c])
            
            #If the direction is upward then the row is decremented and the column is incremented
            if dir == 1:
                if c == n-1:        #To avoid out of bound error and to switch at the next row 
                    dir = -1
                    r += 1
                                
                elif r == 0:
                    dir = -1
                    c += 1
                else:
                    r-=1
                    c+=1
            #If the direction is downward then the column is decremented and the row is incremented
            else:
                if r == m-1:    #To avoid out of bound error and to switch at the next column  
                    dir = 1
                    c+=1
                elif c == 0:
                    dir= 1
                    r+=1
                else:
                    r+=1
                    c-=1
        return res
        
        