# Time Complexity : O(mn) where m is the num of rows and n is the num of cols
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# If the direction number indicates where we turn
# For each direction, we loop until that direction ends and append to the return matrix
# At the end of the loop, we increment the direction and divide it to get the remainder
class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        rows = len(matrix)
        cols = len(matrix[0])

        left = 0
        right = cols - 1
        up = 0
        down = rows-1

        num = rows*cols

        ans = []

        direction = 0

        i = 0
        j = 0

        while num>1:
            if direction == 0:       # Left to Right motion
                while j < right:
                    ans.append(matrix[i][j])
                    j += 1
                    num -= 1
                up += 1
            elif direction == 1:    # Top to Bottom motion
                while i < down:
                    ans.append(matrix[i][j])
                    i += 1
                    num -= 1
                right -= 1
            elif direction == 2:    # Right to Left motion
                while j > left:
                    ans.append(matrix[i][j])
                    j -= 1
                    num -= 1
                down -= 1
            elif direction == 3:    # Bottom to Top motion
                while i > up:
                    ans.append(matrix[i][j])
                    i -= 1
                    num -= 1
                left += 1
            direction = (direction + 1) % 4

        ans.append(matrix[i][j])
        return ans
