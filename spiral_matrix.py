// Time Complexity :O(m*n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :No


// Your code here along with comments explaining your approach
class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        m=len(matrix)
        n=len(matrix[0])
        top=0
        left=0
        bottom=m-1
        right=n-1
        i,j=0,0
        res=[]
        while(top<=bottom and left<=right):
            #top row
            for i in range(left,right+1):
                res.append(matrix[top][i])
            top+=1
            
            #last column
            for j in range(top,bottom+1):
                res.append(matrix[j][right])
            right-=1
            
            #bottom row
            if(top<=bottom):
                for i in range(right,left-1,-1):
                    res.append(matrix[bottom][i])
                bottom-=1
            
            #first column
            if(left<=right):
                for j in range(bottom,top-1,-1):
                    res.append(matrix[j][left])
                left+=1
        
        return res
