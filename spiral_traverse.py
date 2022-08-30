# // Time Complexity : O(m*n)
# // Space Complexity : O(m*n)
# // Did this code successfully run on Leetcode : Yes but tricky in python
# // Three line explanation of solution in plain english

# // Your code here along with comments explaining your approach

class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        if len(matrix)==0 or matrix==None:
            return []
        
        m=len(matrix)
        n=len(matrix[0])
        left,top=0,0
        right,bottom=n,m
        result=[]
        
        while top<bottom and left<right:
            
            #Top Wall
            for i in range(left,right):
                result.append(matrix[top][i])
            
            top+=1
            
            #Right Wall
            for i in range(top,bottom):
                result.append(matrix[i][right-1])
            
            right-=1
            
            if not(left<right and top<bottom):
                break
            #Bottom Wall
            for i in range(right-1,left-1,-1):
                result.append(matrix[bottom-1][i])
            
            bottom-=1
            
            #left wall
            for i in range(bottom-1,top-1,-1):
                result.append(matrix[i][left])
            left+=1
        return result