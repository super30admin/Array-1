# TC-O(n*m)
# SC-O(1)-- array not considered

class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        m=len(matrix)
        n=len(matrix[0])
        left=0
        right=n-1
        top=0
        bottom=m-1
        lis=[]
        while (top<=bottom and left<=right):
            for i in range(left,right+1):
                lis.append(matrix[top][i])
            top=top+1
            for i in range(top,bottom+1):
                lis.append(matrix[i][right])
            right=right-1
            if top<=bottom and left<=right:
                for i in reversed(range(left,right+1)):
                    lis.append(matrix[bottom][i])
                bottom=bottom-1
                for i in reversed(range(top,bottom+1)):
                    lis.append(matrix[i][left])
                left=left+1
        return lis