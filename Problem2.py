'''
Time Complexity: O(m*n)
Space COmplexity: O(1)
Run on Leetcode: YES
'''
class Solution:
    def findDiagonalOrder(self, mat: list[list[int]]) -> list[int]:
        i = 0
        j = 0
        rows = len(mat)
        cols = len(mat[0])
        up = True
        result = []
        while i < rows and j < cols:
            result.append(mat[i][j])
            if up:
                if j == cols - 1:
                    i += 1
                    up = False
                elif i == 0:
                    j += 1
                    up = False
                else:
                    i -= 1
                    j += 1
            else:
                if i == rows - 1:
                    j += 1
                    up = True
                elif j == 0:
                    i += 1
                    up = True
                else:
                    i += 1
                    j -= 1
        return result