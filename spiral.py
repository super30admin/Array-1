# Time Complexity : O(M*N)
# Space Complexity : O(1) 
# Did this code successfully run on Leetcode : YES
# Any problem you faced while coding this : NO

class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        
        m = len(matrix)
        n = len(matrix[0])
        top = 0
        bottom = m-1
        left = 0
        right = n-1
        
        res = []

        while(left<=right and top<=bottom):
            #top row
            if (left<=right ):
                for j in range(left,right+1):
                    res.append(matrix[top][j])
            top+=1
            
            if (left<=right):
                for i in range(top,bottom+1):
                    res.append(matrix[i][right])
            right-=1
            
            if (top<=bottom):
                for j in range(right,left-1,-1):
                    res.append(matrix[bottom][j])
            bottom-=1
            
            if (left<=right):
                for i in range(bottom,top-1,-1):
                    res.append(matrix[i][left])
            left+=1
            
        return res
            
            
            
            
