#Time Complexity O(m*n)
class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        if not matrix or not matrix[0]: return []
        top = bot = left = right = 0
        direction = [[0,1],[1,0],[0,-1],[-1,0]]
        padding = [[1,0,0,0],[0,1,0,0],[0,0,1,0],[0,0,0,1]]
        d = 0
        R = len(matrix)
        C = len(matrix[0])
        goal = R*C
        row = col = 0
        ans = []
        while goal:
            while 0 + top <= row < R - bot and 0 + left <= col < C - right:
                ans.append(matrix[row][col])
                goal -=1
                row += direction[d][0]
                col += direction[d][1]

            row -= direction[d][0]
            col -= direction[d][1]
            top += padding[d][0]
            right += padding[d][1]
            bot += padding[d][2]
            left += padding[d][3]

            d = (d + 1) % 4
            row += direction[d][0]
            col += direction[d][1]
        return ans
