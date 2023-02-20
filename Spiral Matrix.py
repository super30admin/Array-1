# Time Complexity : O(n*m)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes

class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        l = []
        r = len(matrix)
        c = len(matrix[0])
        top = 0
        bottom = r - 1
        left = 0
        right = c - 1
        # print(matrix[2][1])
        while left <= right and top <= bottom:
            #             top
            if left <= right and top <= bottom:
                for i in range(left, right + 1):
                    l.append(matrix[top][i])
                top += 1
            # right
            # print(top,bottom)
            if left <= right and top <= bottom:
                # print('y')
                for i in range(top, bottom + 1):
                    l.append(matrix[i][right])
                right -= 1
            # bottom
            if left <= right and top <= bottom:
                for i in range(right, left - 1, -1):
                    l.append(matrix[bottom][i])
                bottom -= 1
            # left
            if left <= right and top <= bottom:
                for i in range(bottom, top - 1, -1):
                    l.append(matrix[i][left])
            left += 1

        return l

