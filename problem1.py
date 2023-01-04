#time O(m*n)
#space O(1)
class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        if not matrix or not matrix[0]:
            return []
        left, right, top, down = 0, len(matrix[0])-1, 0, len(matrix)-1
        rst = []
        while right >= left and down >= top:
            for col in range(left, right+1):
                rst.append(matrix[top][col])
            top += 1
            for row in range(top, down+1):
                rst.append(matrix[row][right])
            right -= 1
            if top<=down:
                for col in range(right, left-1,-1):
                    rst.append(matrix[down][col])
                down -= 1
            if left<=right:
                for row in range(down,top-1,-1):
                    rst.append(matrix[row][left])
                left += 1
        # if right == left:
        #     for row in range(top, down+1, 1):
        #         rst.append(matrix[row][right])
        # elif top == down:
        #     for col in range(left, right+1, 1):
        #         rst.append(matrix[top][col])
        
        return rst
        