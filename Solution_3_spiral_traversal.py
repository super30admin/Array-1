// Time Complexity : O(m*n) 
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        m= len(matrix)    #number of rows
        if m==0: return []
        n=  len(matrix[0]) #number of columns
        
        #get the pointers
        left=0
        right=n-1
        top=0
        bottom=m-1
        
        result=[]
        
        while(left<=right and top<=bottom):
            
            for i in range(left,right+1,1):
                result.append(matrix[top][i])
            top=top+1
            
            for i in range(top,bottom+1,1):
                result.append(matrix[i][right])
            right=right-1
            
            if top<=bottom:
                for i in range(right,left-1,-1):
                    result.append(matrix[bottom][i])
                bottom=bottom-1
            if left <=right:
                for i in range(bottom,top-1,-1):
                    result.append(matrix[i][left])
                left=left+1
        return result
            
            
            
       
		
		