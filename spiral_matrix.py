def spiralOrder(self, matrix: List[List[int]]) -> List[int]: #TC: O(m*n) SC:O(1)
        m=len(matrix)
        n=len(matrix[0])
        r=c=0
        result=[]
        # self.helper(matrix,0,0,n-1,m-1)
        
        top=left=0
        bottom=m-1
        right=n-1
    # def helper(self, matrix, left, top, right, bottom):
        while top <= bottom and left <= right:
            
            # top row
            for i in range(left, right + 1):
                result.append(matrix[top][i])
            top += 1

            # right column
            for i in range(top, bottom + 1):
                result.append(matrix[i][right])
            right -= 1

            if top<=bottom:
            # bottom row
                for i in range(right, left - 1, -1):
                    result.append(matrix[bottom][i])
                bottom -= 1

            if left <= right:
            # left column
                for i in range(bottom, top - 1, -1):
                    result.append(matrix[i][left])
                left += 1
        return result