class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        # Time complexity = O(N*M) since we process each element exactly once
        # space complexity = O(1)
        if not mat or not mat[0]:
            return []
        N = len(mat)
        M = len(mat[0])
        up = 1
        i = 0
        j = 0
        output = []
        while i < N and j < M:
            output.append(mat[i][j])  # append 1st element
            if up == 1:
                new_row = i - 1
                new_col = j + 1
            else:
                new_row = i + 1
                new_col = j - 1
            if new_row < 0 or new_row == N or new_col < 0 or new_col == M:
                if up == 1:
                    if j == M - 1:
                        i += 1
                    elif j < M - 1:
                        j += 1
                if up == -1:
                    if i == N - 1:
                        j += 1
                    elif i < N - 1:
                        i += 1
                up *= -1
            else:
                i = new_row
                j = new_col
        return output
