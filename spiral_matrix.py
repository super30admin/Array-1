# https://leetcode.com/problems/spiral-matrix/

# To implement the spiral matrix used four boundries top, bottom, left and right. Using these boundries we traverse right, down, left and up. Used while loop to check the boudries are crossing each other, if they do stop the loop.
# Time Complexity- O(m * n) Space Complexity- O(1)

class Solution:
    def spiralOrder(self, matrix: list[list[int]]) -> list[int]:
        m = len(matrix)
        n = len(matrix[0])

        top, bottom , left, right = 0, m - 1, 0, n - 1
        result = []
        # condition to make sure top and bottm, left and right should not cross each other
        while top <= bottom and left <= right:
            # append the top row from left to right
            for i in range(left, right + 1):
                result.append(matrix[top][i])
            # move top row to below row
            top += 1
            # append the rightmost column from top to bottom
            for i in range(top, bottom + 1):
                result.append(matrix[i][right])
            # move to inner column(right to left)
            right -= 1
            # append the bottom row from right to left
            if top <= bottom:
                for i in range(right, left - 1, -1):
                    result.append(matrix[bottom][i])
                # move the bottom row up
                bottom -= 1
            # append the leftmost column from bottom to top
            if left <= right:
                for i in range(bottom, top - 1, -1):
                    result.append(matrix[i][left])
                # move the left boundry right
                left += 1

        return result


solution = Solution()
print(solution.spiralOrder([[1,2,3],[4,5,6],[7,8,9]]))
print(solution.spiralOrder([[1,2,3,4],[5,6,7,8],[9,10,11,12]]))