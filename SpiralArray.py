# Time Complexity : O(M x N) //As it would run for each row and column of the array
#  Space Complexity : O(1) //As we are using the same array to return the result
#  Did this code successfully run on Leetcode : Yes
#  Any problem you faced while coding this : N/A

#  Your code here along with comments explaining your approach
class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        #Declare the bounds of array
        m = len(matrix) 
        n= len(matrix[0]) 
        
        #Declare our result array and the directions
        res = []
        t,l=0,0
        r,b = n-1,m-1
        
        #Iterate till the top corsses the botom or the left crosses the right
        while t <= b and l <= r:
            
            #top row
            for i in range(l,r+1):
                res.append(matrix[t][i])
            t+=1        #move the top position to row below
            
            #right col
            for i in range(t,b+1):
                res.append(matrix[i][r])
            r-=1        #move the right position to column to the left
            
            #bottom row
            if t <= b:
                for i in range(r,l-1,-1):
                    res.append(matrix[b][i])
                b-=1     #move the bottom position to row above
            
            #left row
            if l <= r:
                for i in range(b,t-1,-1):
                    res.append(matrix[i][l])
                l+=1    #move the left position to column to the right
        return res