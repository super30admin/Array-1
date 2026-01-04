class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        top,left, bottom, right = 0,0,len(matrix)-1, len(matrix[0])-1
        result = []

        while(top<=bottom and left<=right):

            for i in range(top, right+1):
                result.append(matrix[top][i])
            top+=1

            for i in range(top, bottom+1):
                result.append(matrix[i][right])
            right-=1

            if(left>right or top>bottom):
                break

            for i in range(right, left-1,-1):
                result.append(matrix[bottom][i])
            bottom-=1


            for i in range(bottom, top-1, -1):
                result.append(matrix[i][left])
            left+=1

        return result

