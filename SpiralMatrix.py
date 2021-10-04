# Time complexity: O(m*n) where n is the length of the array
# Space complexity: O(1) if result array space is ignored
# Did this run successfully on Leetcode: Yes
# Did you face any problem in solving this: No, I had seen this problem before

class Solution:
    def spiralOrder(self, matrix):
        top, bottom = 0, len(matrix)
        left, right = 0, len(matrix[0])

        result = []

        while top < bottom and left < right:
            if top < bottom:
                for i in range(left, right):
                    result.append(matrix[top][i])
            top += 1

            if left < right:
                for i in range(top, bottom):
                    result.append(matrix[i][right-1])
            right -= 1

            if top < bottom:
                for i in range(right-1, left-1, -1):
                    result.append(matrix[bottom-1][i])
            bottom -= 1

            if left < right:
                for i in range(bottom-1, top-1, -1):
                    result.append(matrix[i][left])
            left += 1

        return result


solution = Solution()
print(solution.spiralOrder([[1, 2, 3], [4, 5, 6], [7, 8, 9]]))
print(solution.spiralOrder([[1, 2, 3, 4], [5, 6, 7, 8], [9, 10, 11, 12]]))
