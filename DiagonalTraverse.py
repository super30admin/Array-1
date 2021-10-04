# Time complexity: O(m*n) where m is the rowLength and n is the colLength
# Space complexity: O(m*n) where m is the rowLength and n is the colLength
# Did this run successfully on Leetcode: Yes
# Did you face any problem in solving this:Yes, wasn't able to resolve edge cases. Worked through a video solution to understand it.

class Solution:
    def findDiagonalOrder(self, mat):
        row, col = 0, 0

        m = len(mat)
        if m == 0:
            return []
        n = len(mat[0])
        if n == 0:
            return []
        result = [0]*(m*n)
        for k in range(m*n):
            result[k] = mat[row][col]
            if (row+col) % 2 == 0:
                if col == n-1:
                    row += 1
                elif row == 0:
                    col += 1
                else:
                    row -= 1
                    col += 1
            else:
                if row == m-1:
                    col += 1
                elif col == 0:
                    row += 1
                else:
                    row += 1
                    col -= 1
        return result


solution = Solution()
print(solution.findDiagonalOrder([[1, 2, 3], [4, 5, 6], [7, 8, 9]]))
print(solution.findDiagonalOrder([[1, 2, 3], [5, 99, 6], [7, 8, 90]]))
