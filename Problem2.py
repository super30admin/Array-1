def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        if not mat or not mat[0]:
            return []
        N,M = len(mat),len(mat[0])
        row,col = 0,0
        dir = 1
        result = []
        while row < N and col < M:
            result.append(mat[row][col])
            new_row = row + (-1 if dir == 1 else 1)
            new_col = col + (1 if dir == 1 else -1)
            if new_row<0 or new_row == N or new_col <0 or new_col==M:
                if dir:
                    row += (col==M-1)
                    col +=(col<M-1)
                else:
                    col += (row == N -1)
                    row += (row < N-1)
                dir = 1 - dir
            else:
                row = new_row
                col = new_col
        return result