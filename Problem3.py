#Time Complexity : O(M*N)
#Space Complexity : O(1)
#Did this code successfully run on Leetcode : YES
class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        
        row = len(matrix)
        col = len(matrix[0])
        left = 0
        top = 0
        bottom = row - 1
        right = col - 1
        li = []
        li2 = []
        while top <= bottom and left <= right:
            
                  
            for j in range(left,right+1):
                li2.append(matrix[top][j])  
            top +=1
            
      
            for j in range(top,bottom+1):
                li2.append(matrix[j][right])
            right -=1
            
            if bottom >= top:
                for j in range(right,left-1,-1):
                    li2.append(matrix[bottom][j])
            bottom -=1
            
            if left<=right:
                for j in range(bottom,top-1,-1):
                    li2.append(matrix[j][left])
            left +=1
            
        return li2
                