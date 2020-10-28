class Solution(object):
    def spiralOrder(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: List[int]
        """
        if len(matrix) == 0:
            return
        left = 0
        right = rtemp = len(matrix[0]) - 1
        top = 0
        bottom = len(matrix) - 1
        arr = []
        while (left <= right) and (top <= bottom):
            # right=rtemp
            # top
            for i in range(left, right + 1):
                arr.append(matrix[top][i])
            top += 1
            # right
            for i in range(top, bottom + 1):
                arr.append(matrix[i][right])
            right -= 1

            # bottom
            if top <= bottom:
                for i in range(right, left - 1, -1):
                    arr.append(matrix[bottom][i])
                bottom -= 1
            if left <= right:
                for i in range(bottom, top - 1, -1):
                    arr.append(matrix[i][left])
                left += 1
        return arr
    # time-O(mn) space-O(1)