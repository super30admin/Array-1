# Time Complexity : O(n) where n is row * columns
# Space Complexity : O(n) output list of m * n items
# Did this code successfully run on LeetCode : No - only 14 test case passed.
# Any problem you faced while coding this : for rest of the failed test case, Im getting one extra element from the
# actual output, can you help with what went wrong in my code.

# four pointers Top, bottom, left, right
# we have four traversal in order
# left to right, - Increase top
# top to bottom, - decrease right
# right to left, - decrease bottom
# bottom to right, - increase left


class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:

        if not matrix or not matrix[0]:
            return []

        left = 0
        right = len(matrix[0]) - 1

        top = 0
        bottom = len(matrix) - 1

        output = []

        print(left, right, top, bottom)
        while left <= right and top <= bottom:

            # left - right
            for i in range(left, right + 1):
                output.append(matrix[top][i])

            top += 1

            # top - bottom
            for j in range(top, bottom + 1):
                output.append(matrix[j][right])

            right -= 1

            # right - left

            for k in range(right, left - 1, -1):
                output.append(matrix[bottom][k])

            bottom -= 1

            # bottom - top

            for l in range(bottom, top - 1, -1):
                print(l, left)
                output.append(matrix[l][left])

            left += 1

            print(left, right, top, bottom)

        return output




