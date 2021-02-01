// Time Complexity : O(n*m)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        if matrix==None or len(matrix)==0 or len(matrix[0])==0:
            return []
        
        lst=[]
        n=len(matrix)
        m=len(matrix[0])
        top=0
        bottom=n-1
        left=0
        right=m-1
        
        while top<=bottom and left<=right:
            #1  Traverse left to right
            for i in range(left, right+1):
                lst.append(matrix[top][i])
            top+=1
            
            #2  traverse right top to right bottom(top to down)
            for i in range(top, bottom+1):
                lst.append(matrix[i][right])
            right-=1
            
            if (top<=bottom):
                #3  traverse right to left
                for i in range(right,left-1,-1):
                    lst.append(matrix[bottom][i])
                bottom-=1
            
            if left<=right:
                #4  traverse bottom to top
                for i in range(bottom, top-1,-1):
                    lst.append(matrix[i][left])
                left+=1
        return lst
