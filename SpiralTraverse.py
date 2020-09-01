// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach

class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        if matrix is None or len(matrix)==0 or len(matrix[0])==0:
            return []
        res=[]
        top=0 #defining borders top,bottom,left and right
        bottom=len(matrix)-1
        left=0
        right=len(matrix[0])-1
        while top<=bottom and left<=right: # condition to make sure correct spiral order is maintained
            #top:left -> right
            for x in range(left,right+1): # left to right in first row
                res.append(matrix[top][x])
            top+=1
            #right : top -> bottom
            for x in range(top,bottom+1): # top to bottom in last column
                res.append(matrix[x][right])
            right-=1
            
            #bottom : right -> left
            if top<=bottom: #condition to make sure top doesnt go beyond bottom to avoid duplicate elements
                for x in range(right,left-1,-1): # right to left in last row
                    res.append(matrix[bottom][x])
                bottom-=1
            #left : bottom -> top
            if left<=right:
                for x in range(bottom,top-1,-1): # bottom to top in first column
                    res.append(matrix[x][left])
                left+=1
        return res
                