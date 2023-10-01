# Time complexity:O(MN) N-lenght of rows and M- length of columns
# space complexity:O(1)

class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        if matrix==None or len(matrix)==None:
            return []

        result =[]
        m=len(matrix)
        n=len(matrix[0])
        top=0
        bottom=m-1
        left=0
        right=n-1

        while top <=bottom and left<=right:
            #move from left to right  in the top row
            for j in range(left,right+1):
                result.append(matrix[top][j])
                print(matrix[top][j])
            top +=1
            #move from top to bottom in the rightmost column
            for i in range(top,bottom + 1):
                result.append(matrix[i][right])
                print(matrix[i][right])
            right -=1
            #move from right to left for the bottom 
            if top<=bottom:
                for j in range(right,left-1,-1):
                    result.append(matrix[bottom][j])
                bottom -=1
            #move from bottom to top for the left most column
            if left<=right:
                for i in range(bottom, top-1,-1):
                    result.append(matrix[i][left])
                left +=1
        return result
        