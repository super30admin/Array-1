# Directional Simulation
#Start from the top-left and traverse the matrix diagonally.
#Flip direction when hitting the matrix boundaries (top, bottom, left, right).
#Keep updating the result array as you move in up-right or down-left directions.
# TC = O(m*n), SC=O(1)
class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        m, n = len(mat), len(mat[0])
        result = [0] * (m * n)

        row = col = 0      # Start at top-left
        dir = True    # Direction flag: True = up-right, False = down-left

        for i in range(m * n):
            result[i] = mat[row][col]  # Add current cell to result

            if dir:
                if col == n - 1:       # Hit right edge
                    row += 1          # Move down
                    dir = False  # Change direction
                elif row == 0:         # Hit top edge
                    col += 1          # Move right
                    dir = False
                else:
                    row -= 1          # Move up
                    col += 1          # Move right
            else:
                if row == m - 1:       # Hit bottom edge
                    col += 1          # Move right
                    dir = True   # Change direction
                elif col == 0:         # Hit left edge
                    row += 1          # Move down
                    dir = True
                else:
                    row += 1          # Move down
                    col -= 1          # Move left
        return result

# # Group by Diagonal Index Using a HashMap
# # Group elements diagonally by adding row and column indices.
# # Store elements from each diagonal in a HashMap and later traverse them.
# # For even diagonals, reverse the order. For odd, keep it straight.
# # TC = O(m*n), SC=O(m+n)
# class Solution:
#     def findDiagonalOrder(self, mat):
#         m = len(mat)
#         n = len(mat[0])

#         diagonal_map = {}  # Dictionary to group values by i + j (diagonal index)

#         for row in range(m):
#             for col in range(n):
#                 dIdx = row + col  # Diagonal index
#                 if dIdx not in diagonal_map:
#                     diagonal_map[dIdx] = []
#                 diagonal_map[dIdx].append(mat[row][col])  # Group elements by diagonal

#         result = [0] * (m * n)
#         idx = 0

#         # Traverse each diagonal index in order
#         for i in range(m + n - 1):  # Diagonals range from 0 to m+n-2
#             temp = diagonal_map[i]
#             if i % 2 == 0:
#                 # Reverse for even-indexed diagonals
#                 for j in range(len(temp) - 1, -1, -1):
#                     result[idx] = temp[j]
#                     idx += 1
#             else:
#                 # Keep order for odd-indexed diagonals
#                 for j in range(len(temp)):
#                     result[idx] = temp[j]
#                     idx += 1

#         return result