# ## Problem 3
# Given a matrix of m x n elements (m rows, n columns), return all elements of the matrix in spiral order.

#Time Complexity : O(n*m)
# Space Complexity : O(n*m) 
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

#Approach: Keep track of four pointers top,right,bottom and left order and increment/decrement the
# pointers as necessary
class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        
        if matrix is None or len(matrix)==0:
            return []
        left=0
        right=len(matrix[0])-1
        top=0
        bottom=len(matrix)-1
        res=[]
        
        while(left<=right and top<=bottom):
            
            # from left to right
            for i in range(left,right+1):
                res.append(matrix[top][i])
                
            #done traversing the row so increase row
            top+=1
            
            # from top to bottom
            for j in range(top, bottom+1):
                res.append(matrix[j][right])
            
            # done traversing that column, so decrease column
            right-=1
            
            # from right to left
            if top<=bottom:
                for k in range(right,left-1,-1):
                    res.append(matrix[bottom][k])
            
            # done travsering the bottom row, done traversing the outer rectangle, so decrease the bottom value
            bottom-=1
            if left<=right:
                for m in range(bottom,top-1,-1):
                    res.append(matrix[m][left])
                    
            # done travsering the first column, so increase the left t
            left+=1
            
        return res
        
        
