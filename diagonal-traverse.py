# For each diagonal, we start from the top-left corner and move to the bottom-right corner.
# We collect all elements in the diagonal and reverse the order for even-numbered diagonals.
# We then extend the result list with the collected elements.

# Time Complexity : O(m * n)
# Space Complexity : O(m * n) // worst case, we store all elements in the intermediate list
# Did this code successfully run on Leetcode : Yes

class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        if not mat or not mat[0]:
            return []
        m, n = len(mat), len(mat[0])
        result = []
        for d in range(m + n - 1):
            intermediate = []
            # Figure out the starting point for this diagonal
            if d < n:
                row = 0
                col = d
            else:
                row = d - n + 1
                col = n - 1
            # Collect all elements in this diagonal
            while row < m and col >= 0:
                intermediate.append(mat[row][col])
                row += 1
                col -= 1
            # Reverse order for even-numbered diagonals
            if d % 2 == 0:
                result.extend(intermediate[::-1])
            else:
                result.extend(intermediate)
        return result
        