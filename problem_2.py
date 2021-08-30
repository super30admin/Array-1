# Did this code successfully run on Leetcode : NO

class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        visited = set()
        m = len(matrix)
        n = len(matrix[0])
        result = []
        i, j = 0, 0
        while len(visited) <= m*n:
            result.append(matrix[i][j])
            visited.add((i, j))
            print(matrix[i][j])
            if i == 0 or (i-1, j) in visited:
                j += 1
            elif j == n-1 or (i, j+1) in visited:
                i += 1
            elif i == m-1 or (i+1, j) in visited:
                j -= 1
            elif j == 0 or (i, j-1) in visited:
                i -= 1
        return result