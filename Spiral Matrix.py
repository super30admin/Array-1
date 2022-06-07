# time complexity is o(mn), where m is number of rows in matrix and n is number of columns in matrix
# space complexity is o(1)
class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        left = 0
        right = len(matrix[0])-1
        top = 0
        bottom = len(matrix)-1
        res = list()
        while(left <= right and top <= bottom):
            #move right
            for i in range(left, right+1):
                res.append(matrix[top][i])
            top += 1
            #move down
            for i in range(top, bottom+1):
                res.append(matrix[i][right])
            right -= 1
            #move left
            if(top <= bottom):
                for i in range(right, left-1, -1):
                    res.append(matrix[bottom][i])
                bottom -= 1
            #move up
            if(left <= right):
                for i in range(bottom, top-1, -1):
                    res.append(matrix[i][left])
                left += 1
        return res