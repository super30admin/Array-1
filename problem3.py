# // Time Complexity : O(m*n)
# // Space Complexity : O(mn)
# // Did this code successfully run on Leetcode : Yes
# // Three line explanation of solution in plain english
#
# // Your code here along with comments explaining your approach2
class Solution(object):
    def spiralOrder(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: List[int]
        """
        answer = []

        right = len(matrix[0]) - 1
        left = 0
        top = 0
        down = len(matrix) - 1

        while (left <= right) and (top <= down):

            i = left

            while i <= right and (left <= right) and (top <= down):

                answer.append(matrix[top][i])
                i = i + 1

            top = top + 1
            i = top

            while i <= down and (left <= right) and (top <= down):

                answer.append(matrix[i][right])
                i = i + 1

            right = right - 1
            i = right

            while i >= left and (left <= right) and (top <= down):

                answer.append(matrix[down][i])
                i = i - 1

            down = down - 1
            i = down

            while i >= top and (left <= right) and (top <= down):

                answer.append(matrix[i][left])
                i = i - 1

            left = left + 1

        return answer







