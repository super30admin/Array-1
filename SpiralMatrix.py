# Time Complexity: O(n^2)
# Space Complexity: O(1)
class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        m=len(matrix)
        n=len(matrix[0])
        left=0
        right=n-1
        top=0
        bottom=m-1
        output=[]
        while(left<=right and top<=bottom):
            #move from left to right
            if(left<=right and top<=bottom):
                for j in range(left,right+1):
                    output.append(matrix[top][j])
                top=top+1

            if(left<=right and top<=bottom):
                #move from top to bottom
                for i in range(top,bottom+1):
                    output.append(matrix[i][right])
                right=right-1
            if (left<=right and top<=bottom):
                #move from right to left
                for j in range(right,left-1,-1):
                    output.append(matrix[bottom][j])
                bottom=bottom-1
            if(left<=right and top<=bottom):
                #move from bottom to top
                for i in range(bottom,top-1,-1):
                    output.append(matrix[i][left])
                left=left+1
        return output