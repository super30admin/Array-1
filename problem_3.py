# Did this code successfully run on Leetcode : YES

# class Solution:
#     def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
#         visited = set()
#         m = len(matrix)
#         n = len(matrix[0])
#         result = []
#         i, j = 0, 0
#         while len(visited) <= m*n:
#             result.append(matrix[i][j])
#             visited.add((i, j))
#             print(matrix[i][j])
#             if i == 0 or (i-1, j) in visited:
#                 j += 1
#             elif j == n-1 or (i, j+1) in visited:
#                 i += 1
#             elif i == m-1 or (i+1, j) in visited:
#                 j -= 1
#             elif j == 0 or (i, j-1) in visited:
#                 i -= 1
#         return result


# TC: O(m*n)
# SC: O(1)

# approach
# we know sequence of traversal - make sure to set boundaries after every direction is traversed
# repeat in updated boundaries

class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        m = len(matrix)
        n = len(matrix[0])
        left, top, right, bottom = 0, 0, n-1, m-1
        result = []
        while left <= right and top <= bottom:
            # top row
            for i in range(left, right+1):
                result.append(matrix[top][i])
            top += 1
            # right col
            for i in range(top, bottom+1):
                result.append(matrix[i][right])
            right -= 1
            # bottom row
            if left <= right and top <= bottom:
                for i in range(right, left-1, -1):
                    result.append(matrix[bottom][i])
            bottom -= 1
            # left col
            if left <= right and top <= bottom:
                for i in range(bottom, top-1, -1):
                    result.append(matrix[i][left])
            left += 1
            
        return result