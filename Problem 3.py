#Time Complexity: O(m*n)
#Space Complexity: O(1)

class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        if matrix ==None or len(matrix)==0:
            return
        m = len(matrix)
        n = len(matrix[0])
        result = [] * (m*n)
        top = 0
        bottom = m-1
        left = 0
        right = n-1
        while(top<=bottom and left<=right):
            #Top
            for j in range (left,right+1):
                result.append(matrix[top][j])
            top+=1
            #Right
            for i in range(top,bottom+1):
                result.append(matrix[i][right])
            right-=1
            #Bottom
            if (top<=bottom):
                for j in range(right,left-1,-1):
                    result.append(matrix[bottom][j])
            bottom-=1
            #Left
            if (left<=right):
                for i in range(bottom,top-1,-1):
                    result.append(matrix[i][left])
            left+=1
        return result