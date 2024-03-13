# Time Complexity : O(m*n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes

class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        m = len(matrix)
        n = len(matrix[0])
        top = 0
        left = 0
        right = n-1
        bottom = m-1
        result = []
        i,j = 0,0
        while left<=right and top<=bottom:
            #Traverse top row and increment top
                for j in range(left,right+1):
                    result.append(matrix[top][j])
                top+=1
                #Traverse right col and decrement right
                if left<=right and top<=bottom:
                    for i in range(top,bottom+1):
                        result.append(matrix[i][right])
                    right-=1
                #Traverse bottom row and decrement bottom
                if left<=right and top<=bottom:
                    for j in range(right,left-1,-1):
                        result.append(matrix[bottom][j])
                    bottom-=1
                #Traverse left col and increment left
                if left<=right and top<=bottom:
                    for i in range(bottom,top-1,-1):
                        result.append(matrix[i][left])
                    left+=1
        return result

        