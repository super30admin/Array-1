# // Time Complexity : O(m*n)
# // Space Complexity : O(m*n)
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this : No
class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        row = len(matrix)
        column = len(matrix[0])
        top , bottom , left, right = 0 , row-1, 0 , column-1
        result =[]
        while(top<=bottom and left<=right): #Focus on the base variables used in while loop. If they are changing, then you have to check every time they have changed
            #top row
            for i in range(left,right+1):
                result.append(matrix[top][i])
            top+=1
            #right column
            if(top<=bottom and left<=right):
                for i in range(top,bottom+1): #Here top element will start from second row and hence wont be duplicated
                    result.append(matrix[i][right])
                right-=1
            #Bottom row
            if(top<=bottom and left<=right):
                for i in range(right,left-1,-1):
                    result.append(matrix[bottom][i])
                bottom-=1
            #left column
            if(top<=bottom and left<=right):
                for i in range(bottom,top-1,-1):
                    result.append(matrix[i][left])
                left+=1
        return result