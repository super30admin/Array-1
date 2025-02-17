class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        if not mat or not mat[0]:
            return []
        
        m, n = len(mat), len(mat[0])
        result = []
        diagonals = {}

        for i in range(m):
            for j in range(n):
                diagonal_index = i + j
                if diagonal_index not in diagonals:
                    diagonals[diagonal_index] = []
                diagonals[diagonal_index].append(mat[i][j])

        for k in range(m + n - 1):
            if k % 2 == 0:
                result.extend(reversed(diagonals[k]))
            else:
                result.extend(diagonals[k])

        return result
#time - O(m*n)
#space - O(m*n)
    